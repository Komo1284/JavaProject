-- PL/SQL 에서 프로시저와 함수의 차이
-- 1. 프로시저는 반환값을 가질 수는 있다.
-- 2. 함수는 반환값을 가져야 한다
-- 3. 프로시저는 select 같은 구문에서 사용할 수 없다.
-- 4. 함수는 select에서 실행이 가능하다

-- select test3(1,5) from dual;
select sum(salary) from emp;

begin
    dbms_output.put_line('프로시저 실행~');
    
    test3(1,5);     -- 저장된 프로시저는 다른 프로시저에서 사용한다
    
    dbms_output.put_line('프로시저 종료~');
end;