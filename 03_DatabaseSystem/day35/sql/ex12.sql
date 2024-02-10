-- 반복문 while

declare
    i number := 1;
    v_sum number := 0;
begin
    while i <= 5 loop
        v_sum := v_sum + i;
        i := i + 1;
    end loop;
    
    dbms_output.put_line('1 ~ 5까지 합 : ' || V_sum);
end;