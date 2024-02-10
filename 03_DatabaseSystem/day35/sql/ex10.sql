-- 연습)
-- student 테이블에서 한 학생의 정보를 가져온다
-- 국 영 수 점수의 합계 평균이 60점 이상이면 합격
-- 학생의 점수와 합격 여부를 student_test 테이블에 저장

create table student_test(
    idx number,
    name varchar2(20),
    avg number,
    pass varchar2(10)
);

declare
    v_idx number;
    v_name varchar2(10);
    v_avg number;
    v_result varchar2(30) := '불합격';
begin
    select round((kor + eng + mat)/3,2), idx, name 
    into v_avg, v_idx, v_name
    from student where idx = '20240101';
    
    
    if v_avg >= 60 then
        v_result := '합격';
    end if;
    insert into student_test
        values(v_idx, v_name, v_avg, v_result);
    dbms_output.put_line('실행 완료');
end;

