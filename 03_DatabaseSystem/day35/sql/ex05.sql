-- 연습)
-- emp 테이블에서 사원 번호 20240106인 사원의 연차를 출력

declare
    v_date date;
    v_cur date := sysdate;
    v_result number;
begin
    select h_date into v_date
    from emp where idx = '20240106';
    v_result := v_cur - v_date;
    v_result := ceil(v_result / 365);
    
    dbms_output.put_line(v_result || '년차');
end;