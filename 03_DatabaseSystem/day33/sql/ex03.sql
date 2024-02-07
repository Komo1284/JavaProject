insert into employee values(default,'홍길동','대리','남','97/01/03','20/05/06','010-1234-5678','hong@naver.com', 3000, '총무부','86/01/05', '051-678-8567', 'ad_dpt@naver.com');
insert into employee values(default,'김수진','사원','여','98/01/03','23/05/06','010-8888-6666','kim@naver.com', 2700, '총무부','86/01/05', '051-678-8567', 'ad_dpt@naver.com');

INSERT INTO employee (name, gender, birth, h_date, phone, email, position, salary, dep_name, dep_create, dep_phone, dep_email)
VALUES ('이영희', '여', '1985-11-30', '2018-07-20', '010-9876-5432', 'jane.smith@gmail.com', '사원', 7000, '개발부', '2018-05-15', '02-1234-5678', 'eng_dept@gmail.com');

INSERT INTO employee (name, gender, birth, h_date, phone, email, position, salary, dep_name, dep_create, dep_phone, dep_email)
VALUES ('김철수', '남', '1995-09-25', '2022-01-05', '010-4444-5555', 'mike.john@gmail.com', '대리', 5000, '경리부', '2021-12-01', '02-1111-2222', 'finance_dept@gmail.com');

INSERT INTO employee (name, gender, birth, h_date, phone, email, position, salary, dep_name, dep_create, dep_phone, dep_email)
VALUES ('이미영', '여', '1988-12-18', '2019-11-01', '010-5555-6666', 'sarah.lee@gmail.com', '과장', 6000, '개발부', '2019-09-10', '02-7777-8888', 'hr_dept@gmail.com');

INSERT INTO employee (name, gender, birth, h_date, phone, email, position, salary, dep_name, dep_create, dep_phone, dep_email)
VALUES ('김영호', '남', '1987-08-20', '2015-06-25', '010-2222-3333', 'robert.kim@gmail.com', '차장', 10000, '기술부', '2015-05-01', '02-3333-4444', 'ops_dept@gmail.com');

INSERT INTO employee (name, gender, birth, h_date, phone, email, position, salary, dep_name, dep_create, dep_phone, dep_email)
VALUES ('박수진', '여', '1993-04-12', '2021-09-15', '010-6666-7777', 'emily.park@gmail.com', '사원', 4000, '기술부', '2021-08-01', '02-8888-9999', 'eng_dept@gmail.com');

INSERT INTO employee (name, gender, birth, h_date, phone, email, position, salary, dep_name, dep_create, dep_phone, dep_email)
VALUES ('천민수', '남', '1992-07-27', '2017-03-12', '010-9999-0000', 'michael.chen@gmail.com', '대리', 4500, '경리부', '2016-12-01', '02-0000-1111', 'finance_dept@gmail.com');

INSERT INTO employee (name, gender, birth, h_date, phone, email, position, salary, dep_name, dep_create, dep_phone, dep_email)
VALUES ('왕소피아', '여', '1996-02-03', '2023-01-02', '010-7777-8888', 'sophia.wang@gmail.com', '사원', 3000, '총무부', '2020-02-01', '02-9876-5432', 'ops_dept@gmail.com');

INSERT INTO employee (name, gender, birth, h_date, phone, email, position, salary, dep_name, dep_create, dep_phone, dep_email)
VALUES ('장우진', '남', '1989-10-09', '2014-08-20', '010-1111-2222', 'william.zhang@gmail.com', '사원', 8000, '개발부', '2019-09-10', '02-7777-8888', 'hr_dept@gmail.com');

INSERT INTO employee (name, gender, birth, h_date, phone, email, position, salary, dep_name, dep_create, dep_phone, dep_email)
VALUES ('류지민', '여', '1997-06-21', '2022-05-10', '010-8888-9999', 'olivia.liu@gmail.com', '사원', 5500, '기술부', '2021-08-01', '02-8888-9999', 'eng_dept@gmail.com');

-- 같은 부서들끼리 값 동일하게 수정
update employee
    set dep_create = '86/01/05',
        dep_phone = '051-678-8567',
        dep_email = 'ad_dpt@naver.com'
    where dep_name = '총무부';
    
update employee
    set dep_create = '21/08/01',
        dep_phone = '02-8888-9999',
        dep_email = 'eng_dept@gmail.com'
    where dep_name = '기술부';
    
update employee
    set dep_create = '16/12/01',
        dep_phone = '02-0000-1111',
        dep_email = 'finance_dept@gmail.com'
    where dep_name = '경리부';

update employee
    set dep_create = '19/09/10',
        dep_phone = '02-7777-8888',
        dep_email = 'hr_dept@gmail.com'
    where dep_name = '개발부';

commit;
select * from employee;