-- delete : 행 삭제
-- 구문 : delete from 테이블명 where 조건;
-- 주의! 조건을 생략시 모든 행이 제거 된다

-- 내가 생각한 조건 결과와 일치하는 select로 디버깅 후 진행 하도록 합시다
select * from person where birth is null;
delete from person where birth is null;

-- 주의! 조건을 생략시 모든 행이 제거 된다
delete from person;

rollback;

-- update : 행 수정
-- 구문 : update 테이블명 set 열1 = 값1, 열2 = 값2 ... where 조건절;
update person
    set 
        name = '정형돈', 
        height = 170
    where name is null;
    
commit;