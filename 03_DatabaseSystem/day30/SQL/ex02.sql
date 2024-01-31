-- database : 데이터를 관리하기 위한 시스템
-- dbms : db를 체계적으로 실행 및 관리하는 소프트웨어
-- 종류 : oracle db, my-sql, ms-sql등

-- sql : structed query language
-- db에서 사용되는 프로그래밍 언어
--
-- 1. ddl : create, drop, alter
-- 2. dml : select, insert, delete, update (crud)
-- 3. dcl : grant, revoke, commit, rollback

-- select : 조회
-- 구문 : select 열1, 열2 ... from 테이블명;
select name from person;
select name, height from person;
select height, name from person;
select * from person;

-- where : 조건절
-- 조건을 활용해서 테이블 조회를 필터링 가능
select * from person where name = '홍길동';
select name from person where name = '홍길동';
select height, birth from person where name = '홍길동';

-- ※ !=과 <>는 같지 않다는 의미로 같은 뜻이다.
select * from person where name <> '홍길동';
select * from person where name != '홍길동';

select * from person where height > 173.2;
select * from person where height >= 173.2;
select * from person where height < 173.2;
select * from person where height <= 173.2;

-- ※ =은 완벽히 동일해야 일치
-- like는 문자열에 특정 패턴을 포함하는 구문을 필터링
select * from person where name like '%진%';

-- 논리 연산자
select * from person where birth >= '00/01/01' and height >= 180;

select * from person
    where birth < '00/01/01'
    and height >= 160;
    
-- order : 정렬
-- 1. asc : 오름차순 (기본값)
-- 2. desc : 내림차순
select * from person order by name asc;
select * from person order by name desc;

-- 제1 비교기준이 동일한 데이터면 콤마로 제2,3의 비교기준 설정이 가능
select * from person order by height, name desc;

select * from person
    where birth >= '00/01/01'
    order by birth;
    
-- 연습) 2000년생 이상이며 키가 170이하인 사람들을 나이순으로 출력

select * from person 
    where birth >= '00/01/01'
    and height <= 170
    order by birth;