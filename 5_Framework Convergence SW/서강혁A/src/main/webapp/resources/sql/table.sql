create user c##user3 identified by 3;

grant connect, resource, dba to c##user3;

create table account(
idx number default seq_a_idx.nextval,
userid varchar2(30) unique not null,
userpw varchar2(128) not null,
nick varchar2(50) unique not null,
j_date date default sysdate,

constraint pk_a_idx primary key(idx)
);

insert into account (userid, userpw, nick)
    values('root', 'qwe', '관리자');
    
insert into account (userid, userpw, nick)
    values('itbank', 'it', '아이티뱅크');
    
select * from account;
desc account;

commit;