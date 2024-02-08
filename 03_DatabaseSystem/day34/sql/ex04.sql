select * from student;

select kor + eng + mat as sum from student;

select idx, name, kor + eng + mat as sum from student;

-- *fmf tkdydtl dpfj
select *, kor + eng + mat as sum from student;

select name, round((kor+eng+mat) /3,1) as avg from student;

select 
    sum(kor + eng + mat) as sum,
    avg(kor + eng + mat) as avg
    from student;

create view student_avg_desc as
    select 
        idx, name, kor, eng, mat,
        kor + eng + mat as sum,
        round((kor + eng + mat) /3,1) as avg
        from student
        order by avg desc;
        
-- view를 조회하는 것은 저장한 select 구문을 매번 실행하는 것이다
-- 즉, 합계와 평균은 조회시 마다 매번 새로 구해서 열이 생성된다
select * from student_avg_desc;

-- 이렇게 다른 열의 연산 등의 조합으로 만들어지는 데이터는
-- 실제(= 물리) 테이블에 저장하면 변경시 반영되지 않는다
create table score (
    kor number,
    eng number,
    mat number,
    sum number,
    avg number
);

-- sum은 kor, eng, mat와 연관성이 없는 열이다
insert into score values(90,85,78,253,84.33);

-- 따라서 kor이 변경되더라도 sum, avg는 변화하지 않음
update score set kor = 91 where kor = 90;
