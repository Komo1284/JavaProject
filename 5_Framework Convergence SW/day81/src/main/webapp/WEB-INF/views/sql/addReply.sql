create table reply(
idx number default seq_rep_idx.nextval,
b_idx number not null,
u_idx number not null,
contents clob default '내용 없음',
w_date date default sysdate,

constraint rep_idx_pk primary key(idx),
constraint u_idx_fk foreign key(u_idx) references account(idx) on delete cascade,
constraint b_idx_fk foreign key(b_idx) references board(idx) on delete cascade
);

drop table reply;

select * from board order by idx desc;

insert into
    reply(b_idx, u_idx, contents)
    values(12564, 1001, '댓글 구현중~~');

insert into
    reply(b_idx, u_idx, contents)
    values(12563, 1001, '관리자 댓글 구현중~~');

commit;

select * from reply;

create view reply_view as
    select r.idx, r.b_idx, r.contents, r.w_date, 
            a.idx as a_idx, a.userid, a.nick
        from reply r
        inner join account a
        on r.u_idx = a.idx
        order by r.idx;

-- 지정 게시글의 댓글 수
select count(*) from reply_view where b_idx = 12564;

-- 지정 게시글의 댓글
select * from reply_view where b_idx = 12564;

select * from reply_view order by idx;

-- 댓글이 있는 게시글만 (inner)
select b.*, r.* 
    from board_view b
    inner join reply_view r
    on b.idx = r.b_idx
    order by b.idx desc;
    
-- 댓글이 없는 게시글도 (left outer)
create view board_reply as
    select b.*, r.idx as r_idx, r.contents as r_contents,
            r.w_date as r_date, r.a_idx, r.userid, r.nick as r_nick
        from board_view b
        left outer join reply_view r
        on b.idx = r.b_idx
        order by b.idx;

drop view board_reply;
    
-- 댓글이 없는 게시글도
select idx, title, nick, r_contents, r_nick
    from board_reply order by idx desc;
    
-- 댓글이 있는 게시글만
select idx, title, nick, r_contents, r_nick
    from board_reply 
    where r_idx is not null
    order by idx desc;

desc board_reply;

-- 댓글 수
select count(idx) from board_reply where idx = 12564;
    
    