-- 조건 제약 : 지정 조건에 맞는지 확인 후 해당 열에 데이터 입력
create table test1 (
    gender varchar2(6)      not null,
    
    constraint test1_gender check(gender in ('남', '여'))
);

drop table test1;

insert into test1 values('남');
insert into test1 values('여');
insert into test1 values('뭐');

--check 제약이라도 not null이 지정되지 않으면 값이 들어간다

select * from test1;