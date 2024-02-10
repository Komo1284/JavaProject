-- 연습)
-- emp 테이블 모든 사원의 연봉을 10% 인상해서 적용하세요

declare
    cursor emp_cur is
    select * from emp;
    v_sal number;
begin
    for ep in emp_cur loop
        v_sal := ep.salary * 1.1;
        
        update emp set salary = v_sal where salary = ep.salary;
    end loop;
end;

commit;

