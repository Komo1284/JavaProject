-- 문제1)
create table account(
    idx number,
    userid varchar2(30) not null,
    userpw varchar2(30) not null,
    nick varchar2(30) not null,
    jdate date default sysdate,
    
    CONSTRAINT idx_pk primary key(idx),
    constraint userid_uk unique(userid),
    constraint nick_uk unique(nick)
);

-- 문제2)
insert into account values(20231001,'itbank','it12','구름달','23/02/13');
insert into account values(20231002,'user','1234','별똥별','23/02/14');
insert into account values(20231003,'hong22','2222','콩콩','23/02/22');
select * from account order by idx desc;

-- 문제3)
update account set nick = '은하수' where userid = 'user';
select * from account order by idx desc;

-- 문제4)
delete from account where userid = 'hong22';
select * from account order by idx desc;

-- 문제5)
create table board(
    idx number,
    title varchar2(30) not null,
    contents varchar2(30) not null,
    writer varchar2(30),
    wdate date default sysdate,
    
    CONSTRAINT board_idx_pk primary key(idx),
    constraint board_FK_writer foreign key(writer) references account(nick)
);

-- 문제6)
insert into board values(1000,'안녕하세요','hello~','은하수','23/02/14');
insert into board values(1001,'오늘 점심은...','햄버거나 먹을까?','은하수','23/02/14');
insert into board values(1002,'퇴근~','차가 막히네...','구름달','23/02/14');

select * from board order by idx desc;

-- 문제7)
select * from board where writer = '은하수' order by idx desc ;

-- 문제8)
select A.idx, userid, nick, B.idx as board_idx, title
    from account A
    inner join board B
    on A.nick = B.writer;
  
-- 문제9)
create view acc_jo_brd as
    select A.idx, userid, nick, B.idx as board_idx, title
        from account A
        inner join board B
        on A.nick = B.writer;

select * from acc_jo_brd;

-- 문제10)
create table board_del(
    idx number,
    title varchar2(30) not null,
    contents varchar2(100) not null,
    writer varchar2(30) not null,
    wdate date,
    ddate date default sysdate,
    
    CONSTRAINT del_idx_pk primary key(idx)
);

-- 문제11)
create or replace procedure del_con(
    del varchar2
) as
    cursor board_cur is
    select * from board;
begin
    for bd in board_cur loop
        if bd.writer = del then
            insert into board_del values(bd.idx, bd.title, bd.contents, bd.writer, bd.wdate, sysdate);
            delete from board where idx = bd.idx;
        end if;
    end loop;
    
end;
