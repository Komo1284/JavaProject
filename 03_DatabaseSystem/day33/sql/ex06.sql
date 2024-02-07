-- 정규화를 시키면 테이블이 나누어진다
-- 따라서, 전체의 결과를 조회 하려면 둘 이상의 테이블을 합쳐서 조회해야한다.

-- A 테이블(emp)
select idx,name,position,dep_idx from emp;

-- B 테이블(dep)
select * from dep;

-- 1. inner join
select A.idx, name, position, dep_idx, dep_name, dep_create
    from emp A
    inner join dep B
    on A.dep_idx = B.idx;
    
-- 2. left/right outer join
-- - 이 join은 서로 동일하지 않은 데이터가 있을 시 가능
insert into dep values(default, '영업부', '051-123-5431','sell@gmail.com','23/03/04');
commit;

select A.idx, name, position, dep_idx, dep_name, dep_create
    from emp A
    right outer join dep B
    on A.dep_idx = B.idx
    order by dep_idx;
    
insert into emp values(default, '김수민', '대리', '여', '99/05/15', '22/01/25', '010-3657-9998','kim@icloud.com', 3100, 600);

 select A.idx, name, position, dep_idx, dep_name, dep_create
    from emp A
    left outer join dep B
    on A.dep_idx = B.idx
    order by dep_idx;
    
 select A.idx, name, position, dep_idx, dep_name, dep_create
    from emp A
    full outer join dep B
    on A.dep_idx = B.idx
    order by dep_idx;