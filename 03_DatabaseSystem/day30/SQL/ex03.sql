-- insert : 행 추가
-- 구문1 : insert into person values(값1, 값2 ...);
insert into person values('유재석', 175.1, '88/05/03');

rollback;   -- 현재 트랜잭션을 모두 회수
commit;     -- 현재 트랜잭션을 모두 적용

-- 트랜잭션 : DB의 최소 작업 단위를 의미한다

-- 구문2 : insert into 테이블(열1, 열2...) values(값1, 값2...)
insert into person(name,height) values('하동훈', 165.3);
insert into person(height,name) values(174.5, '노홍철');
insert into person(height) values(190);
insert into person(name) values('null');

-- null값 판별은 is로
select * from person where birth = null;
select * from person where name = 'null';

select * from person where name is null;
select * from person where name is not null;