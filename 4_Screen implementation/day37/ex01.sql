create table std_sum(
    idx number,
    name varchar2(30),
    kor number,
    eng number,
    mat number,
    s_sum number
);

create or replace procedure std_pro as
    cursor stu_cur is
        select * from student;

    v_sum number;
begin
    for stu in stu_cur loop
        v_sum := stu.kor+stu.eng+stu.mat;
        insert into std_sum values(stu.idx, stu.name, v_sum);
        
    end loop;
    
    commit;
end;

exec std_pro;