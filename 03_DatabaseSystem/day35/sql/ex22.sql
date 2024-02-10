-- 내부(= 지역) 변수는 어떻게?
create or replace procedure test3(
    n1 number,
    n2 number
) as
    -- 여기가 declare라고 생각하면 된다
    v_sum number := 0;
begin
    for i in n1..n2 loop
        v_sum := v_sum + i;
    end loop;
    
    dbms_output.put_line(v_sum);
end;

exec test3(4,5);