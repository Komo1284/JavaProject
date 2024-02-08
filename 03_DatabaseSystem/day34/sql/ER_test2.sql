1. 학생 정보 기입
insert into 
    student(name, grade, gender, email)
    values('홍길동', 0, '남', 'hong@naver.com');
    
insert into 
    student(name, grade, gender, email)
    values('김민지', 0, '여', 'minji@naver.com');
    
insert into
    student(name, grade, gender, email)
    values('박철수', 0, '남', 'su@naver.com');
    
insert into 
    student(name, grade, gender, email)
    values('이지민', 0, '여', 'jimin@naver.com');
    
insert into 
    student(name, grade, gender, email)
    values('김수철', 0, '남', 'kim@naver.com');
    
    
-- 2. 과목 정보 기입
insert into class values(default, 'C언어', '24/02/01', 30);
insert into class values(default, 'C++', '24/02/01', 25);
insert into class values(default, 'C#', '24/02/01', 20);

-- 3. 수강 정보 기입
insert into student_class values(101, 1001); --홍길동 c언어
insert into student_class values(101, 1002); --홍길동 c++
insert into student_class values(102, 1002); --홍길동 c++
insert into student_class values(103, 1001); --홍길동 c언어
insert into student_class values(104, 1003); --홍길동 c#
insert into student_class values(105, 1002); --홍길동 c++

commit;

