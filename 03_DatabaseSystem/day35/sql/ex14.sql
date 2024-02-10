-- 무한 반복
declare
    v_num number := 5;
begin
    loop
        dbms_output.put_line('num = ' || v_num);
        v_num := v_num - 1;
        
        -- 반복 종료 조건
        exit when v_num = 2;
    end loop;
end;