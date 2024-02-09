-- class 테이블에 외래키 추가
alter table class add pro_idx number;
alter table class add constraint pro_idx foreign key(pro_idx) references professor(idx);

-- class에 교수 idx 등록
update class set pro_idx = 1 where idx <= 1002;
update class set pro_idx = 2 where idx = 1003;
commit;

-- 현재 수업 정보를 확인
create view class_pro as
    select A.*, B.name as pro_name, B.gender, B.email
        from class A
        inner join professor B
        on A.pro_idx = B.idx;
        
select * from class_pro;

drop view sign_up;

create view sign_up as
select B.*, A.name as cls_name, A.c_date, 
            A.total, A.pro_idx, A.pro_name, 
            A.gender as pro_gender, A.email as pro_email
        from class_pro A
        inner join (select A.*, B.*
                        from student A
                        inner join student_class B
                        on A.idx = B.stu_idx) B
        on A.idx = B.class_idx;
    
select * from sign_up;
select name, cls_name, c_date, pro_name from sign_up;