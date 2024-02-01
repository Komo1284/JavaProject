-- 1. student 테이블을 생성
-- 열 정보)
-- idx      학번 기본키
-- name     이름 null(x)
-- score    점수 기본값o
-- address  주소 null(x)

-- 2. student 테이블에 데이터를 기입하며 제약 조건 테스트


create table student(
    idx         number,
    name        varchar2(20)    not null,
    score       number          default 0,
    address     varchar(60)     not null,
    
    constraint student_idx primary key(idx)
);

insert into student values(1000,'서강혁',40,'부산시 동래구');

select * from student;

insert into student values(1001,null,40,'부산시 동래구');

-- insert시 지정하지 않은 열에 default가 설정되면 그 값이 채워진다
insert into
    student(idx, name, address)
    values(103, '박민지', '서울특별시 종로구');
