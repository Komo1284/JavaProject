-- sequence : 시퀀스
-- Oracle DB에서 숫자를 증가 시켜주는 객체
-- 이를 이용해서 자동 증가 열로 자주 사용한다

create sequence account_seq
    start with 1003
    increment by 1
    minvalue 1000
    maxvalue 9999999999999999
    nocache;

drop sequence account_seq;

alter table account modify idx number default account_seq.nextval;

insert into
    account (userid, userpw, nick, email)
    values('kakao','ka','카카오','kakao@kakao.com');
    
insert into
    account (userid, userpw, nick, email)
    values('apple','watch','애플','apple@icloud.com');
    
select * from account;