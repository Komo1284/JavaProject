-- 연습)
-- student 테이블에서 모든 학생의 정보를 가져온다
-- 국 영 수 점수의 합계 평균이 60점 이상이면 합격
-- 학생의 점수와 합격 여부를 student_test 테이블에 저장

declare
    cursor stu_cur is
    select * from student;
    v_avg number;
    v_pass varchar2(30) := '불합격';
begin
    for stu in stu_cur loop
        v_avg := round((stu.kor + stu.eng + stu.mat)/3,2);
        
        if v_avg >= 60 then
            v_pass := '합격';
        else
            v_pass := '불합격';
        end if;

        insert into student_test
            values(stu.idx, stu.name, v_avg, v_pass);
        

    end loop;
end;