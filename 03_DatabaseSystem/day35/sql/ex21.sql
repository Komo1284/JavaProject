-- 프로시저의 매개변수 설정
create or replace procedure test2(
    n1 number,
    n2 number
) as
begin
    for i in n1..n2 loop
        dbms_output.put_line(i || ' : Hello World!!!');
    end loop;
end;

exec test2(5, 8);