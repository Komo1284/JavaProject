-- 자주 사용되는 join은 view로 만들어 재사용하면 수월
create view emp_to_dep as
    select A.idx, name, position, dep_idx, dep_name, dep_phone
        from emp A
        inner join dep B
        on A.dep_idx = B.idx
        order by dep_idx, A.idx desc;
rollback;

select * from emp_to_dep;

create view emp_right_dep as
    select A.idx, name, position, dep_idx, dep_name, dep_phone
        from emp A
        right outer join dep B
        on A.dep_idx = B.idx
        order by dep_idx, A.idx desc;
        
select * from emp_right_dep;