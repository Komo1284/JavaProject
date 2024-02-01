-- 제약 조건
-- 특정 열에 기입될 데이터를 제한

-- 1. primart key : 기본키
-- 테이블 당 한개만 지정 가능
-- 기본키인 열은, 중복데이터 및 null값 입력이 차단

-- 2. unique : 고유 제약
-- 테이블에 여러개 지정 가능
-- 기본키 외 중복을 막고 싶은 열에 지정
-- 단, null값이 입력 됨

-- 3. not null : null 제약
-- 테이블에 여러개 지정 가능
-- 지정된 열은 null값 입력이 차단

-- 4. default : 기본값
-- 테이블에 여러개 지정 가능
-- 해당 열에 입력이 생략되는 경우 자동으로 기입될 값을 지정

create table account (
    idx         number,      
    userid      varchar2(20)   not null,
    userpw      varchar2(20)   not null,
    nick        varchar2(60)   not null,
    email       varchar2(60),
    join_date   date           default sysdate,
    
    CONSTRAINT account_idx primary key(idx),
    CONSTRAINT account_userid unique(userid),
    constraint accunt_nick unique(nick)
);

insert into account values(1000,'itbank','it','아뱅','itbank@naver.com','24/02/01');
-- 1번 실행 -> 성공
-- 2번 실행 -> 실패. 중복된 idx가 테이블에 적용되는 것을 방지
insert into account values(1001,'naver','it','네이버','itbank@naver.com','24/02/01');
insert into account values(1002,null,'it',null,'itbank@naver.com','24/02/01');

commit;

select * from account;

drop table account;