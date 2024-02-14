-- emp 테이블에서 수정 발생시 수정 전의 데이터를 emp_back에 insert하는 트리거를 작성
create table emp_back (
    idx         number,
    name        varchar2(30),
    position    varchar2(10),
    gender      varchar2(6),
    birth       date,
    h_date      date,
    phone       varchar2(15),
    email       varchar2(60),
    salary      number,
    dep_idx     number
);

create or replace trigger emp_tri 
    after update on emp
    for each row
declare
begin
    insert into emp_back
        values(:old.idx, :old.name, :old.position, 
               :old.gender, :old.birth, :old.h_date,
               :old.phone, :old.email, :old.salary, :old.dep_idx);
end;

update emp set name = '홍진호' where idx = 20240102;
select * from emp_back;
