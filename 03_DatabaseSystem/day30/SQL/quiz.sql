-- 1. person 테이블에 사람 정보 1개를 추가
-- 값은 아무거나

-- 2. person 테이블에서 birth가 null인 사람들 모두 00/01/01로 변경

-- 3. person 테이블에서 height가 180 이상인 사람 정보 제거

-- 4. 1 ~ 3 트랜잭션을 모두 적용

-- 5. person 테이블의 정보를 출력 나이가 많은 순으로 출력하고 같으면 이름을 사전순으로

insert into person values('김이수', 175.2, '94/12/24');

update person
    set birth = '00/01/01'
    where birth is null;

delete from person where height >= 180;

commit;

select * from person order by birth,name;