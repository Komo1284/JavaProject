create sequence board_seq 
    start with 10001
    increment by 1
    minvalue 10001
    maxvalue 9999999999999999999
    nocache;
    
drop table board;

create table board (
    idx         number          default board_seq.nextval,
    title       varchar2(100)   default '제목없음',
    contents    clob            default '내용없음',
    nick        varchar2(60)    not null,
    view_count  number          default 0,
    w_date      date            default sysdate,
    
    constraint board_idx primary key(idx),
    constraint board_nick foreign key(nick) references account(nick) on delete cascade
);