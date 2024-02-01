--view : 가상 테이블
-- 실제 테이블에서 추출한 정보로 생성한 가상 테이블
-- 가상이므로 실제 용량을 가지지 않는다
-- 특정 테이블의 정보를 제한적으로 제공하기 위해 사용

select idx, nick, join_date from account;

create view account_view as
    select idx, nick, join_date from account;
    
-- view는 가상 테이블이므로 데이터 추가/변경/삭제 불가능

insert into account_view values(1005,'테스트','24/01/01');