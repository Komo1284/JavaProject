-- 실제 현업에서 사용되는 table의 열 개수는 엄청 많을 수 있다
select * from employee order by idx desc;

-- 따라서, 보통 참조할 열만 걸러서 select 하는 경우가 많다
select idx, name, position, salary, dep_name
    from employee
    order by dep_name, salary desc;
    
    
-- 여기서 같은 부서이면 부서면 ~ 부서 이메일은 모두 동일하다
-- 즉, 중복이 발생한다는 의미
select * from employee order by dep_name;