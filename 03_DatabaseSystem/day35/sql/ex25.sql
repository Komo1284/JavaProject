-- test4 프로시저 실행

declare
    result number;

begin
    dbms_output.put_line('start~');
    
    test4(1, 10, result);
    
    dbms_output.put_line('result = ' || result);
end;