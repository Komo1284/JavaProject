-- 외래키
-- - 다른 테이블의 열을 참조하는 제약 조건
-- - 참조 중인 열에 없는 데이터면 외래키 열에 입력이 방지 된다 (= 무결성)
-- - 다른 테이블과의 관계를 표현시 사용 하기도 한다

-- 외래키 지정 전에 참조할 열에 없는 데이터가 있으면 외래키 설정이 안된다
delete from emp where dep_idx = 600;
commit;

select idx, name, dep_idx from emp;

-- 추가 후 emp 테이블을 열어서 Model 탭을 확인
alter table emp add constraint emp2_fk_depidx foreign key(dep_idx) references dep(idx);

-- dep_idx에 600은 참조 중인 dep의 idx에 없는 데이터
insert into emp values(default, '김수민', '대리', '여', '99/05/15', '22/01/25', '010-3657-9998','kim@icloud.com', 3100, 600);
