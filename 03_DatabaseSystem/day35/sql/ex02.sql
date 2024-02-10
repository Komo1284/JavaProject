
declare
    v_name varchar2(20);
    v_age number := 20; -- :=가 변수 대입 연산자
begin
    select 
        name into v_name
        from person
        where height = 170;
        
    v_age := v_age + 5;
        
    dbms_output.put_line('이름 : ' || v_name);
    dbms_output.put_line('나이 : ' || v_age);
end;