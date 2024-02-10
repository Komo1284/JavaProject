-- 반복문 for
begin
    for i in 1 .. 5 loop
        dbms_output.put_line(i || ' : Hello World');
    end loop;
    
    for i in reverse 1 .. 5 loop
        dbms_output.put_line(i || ' : Hello SQL');
    end loop;
end;