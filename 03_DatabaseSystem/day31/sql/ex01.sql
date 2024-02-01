drop table student;

create table student (
    name    varchar2(20),
    kor     number,
    eng     number,
    mat     number,
    birth   date
);

-- 아래 구문을 5번정도 실행
insert into student
    values('홍길동',70,80,98,'11/06/25');
    
-- 테이블을 확인하니 중복 데이터가 발생한다
select * from student;

-- 중복 데이터의 문제점
-- 1. 데이터양이 증가하기 때문에 성능 저하의 원인이 됨
-- 2. 데이터의 연쇄 삭제 및 수정이 발생
update student
    set name = '홍진호',
        kor = 22,
        eng = 22,
        mat = 22
    where name = '홍길동';
    
delete from student where name = '홍진호';

drop table student;