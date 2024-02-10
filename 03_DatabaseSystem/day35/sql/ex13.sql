-- 연습)
-- 정수값을 하나 아무거나 저장 후
-- 그 정수를 거꾸로 출력
-- ex) 123 -> 321

declare
    v_num number := 1234;
    v_rev number := 0;
begin
    while v_num != 0 loop
        v_rev := v_rev * 10 + mod(v_num, 10);
        v_num := trunc(v_num / 10);
    end loop;
    
    dbms_output.put_line(v_rev);
end;