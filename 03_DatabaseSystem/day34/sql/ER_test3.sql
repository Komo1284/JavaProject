-- 수강 정보를 확인하자
select A.*, B.*
    from student A
    inner join student_class B
    on A.idx = B.stu_idx;

select * from student_class;

create view sign_Up as
    select B.*, A.name as class_name, a.c_date, a.total
        from class A
        inner join (select A.*, B.*
                        from student A
                        inner join student_class B
                        on A.idx = B.stu_idx) B
        on A.idx = B.class_idx;
        
select class_name, count(*) from sign_up group by class_name;
select * from sign_up where class_name = 'C언어';