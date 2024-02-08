-- 집계 함수 및 그룹화
select * from employee;
select idx, name, position, gender, dep_name from employee;

-- count() : 행의 개수를 반환

select count(name) from employee;

update employee set gender = null where name = '홍길동';
commit;

-- null인 행은 카운트 하지 않는다
select count(gender) from employee;

-- +는 모든 열을 의미하는데 단순히 테이블 전체 행 개수를 반환할 때 사용
select count(*) from employee;

-- 특정열로 그룹화
select dep_name, count(*) from employee group by dep_name;

-- ※ 그룹화 하는 열의 개수와 다른 열을 조회하면 에러
select name, count(*) from employee group by dep_name;

select distinct name from employee;
select distinct dep_name from employee;


-- 연습1) 직급별 사람 수를 출력
select position, count(*) from employee group by position;

-- 연습2) 남/여별 사람 수를 출력
select gender, count(*) from employee group by gender;


-- having : 그룹화 후의 조건을 판별
-- 1. 부서별 인원수가 3명 이상인 부서
select dep_name, count(*) 
    from employee 
    group by dep_name 
    having count(*) > 2;
    
-- 2. 직급별 인원 수가 2명 이하인 직급
select position, count(*)
    from employee
    group by position
    having count(*) <= 2;
    
-- ※ select의 실제 완전 구문
-- ※ where는 그룹화 전 조건, having은 그룹화 후 조건
select position, count(*)
    from employee
    where salary > 3000
    group by position
    having count(*) >= 2
    order by count(*) asc;
    