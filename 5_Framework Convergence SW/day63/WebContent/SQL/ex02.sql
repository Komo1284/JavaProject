select idx, userid, nick from account order by idx desc;

insert into board(title, contents, nick) values('안녕하세요', '반갑습니다', '관리자');
insert into board(nick) values('네버');
insert into board(title, nick) values('오늘은 day62', '관리자');

commit;

select banner from v$version;
desc board;

select * from board where idx = 10006;

update board 
    set view_count = view_count + 1
    where idx = 10006;
    
rollback;