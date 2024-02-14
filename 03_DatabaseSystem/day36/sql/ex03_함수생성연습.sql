-- 1. 절대값을 반환하는 함수
create or replace function abs(
    n1 number
) return number as
    result number;
begin
    if n1 < 0 then
        result := n1 * -1;
    else
        result := n1;
    end if;
    
    return result;
end;

-- 2. 전달된 수를 거꾸로 만들어 반환
create or replace function rev(
    n1 number
) return number as
    n2 number := n1;
    result number := 0;
begin
    while n2 != 0 loop
        result := result * 10 + mod(n2,10);
        n2 := trunc(n2 / 10);
    end loop;
    
    return result;
end;

exec dbms_output.put_line(abs(-5));
select rev(123) from dual;