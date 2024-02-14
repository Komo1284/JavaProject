set serveroutput on;

-- 함수는 프로시저 내에서도 사용 가능하며
declare
    n number;
begin
    n := adder(5,6);
    dbms_output.put_line('n = ' || n);
end;

-- select 절에서도 사용 가능하다
select name, adder(kor, eng) from student;