-- 날짜

declare
    v_birth date := '1996/02/29';
    v_cur date := sysdate;
    v_result number;
begin
    dbms_output.put_line(v_birth);
    dbms_output.put_line(v_cur);
    
    -- 현재 날짜와 생일의 차이를 구한다
    v_result := v_cur - v_birth;
    
    -- 365일로 나눈다
    v_result := v_result / 365;
    
    -- 소수점 컷 (round는 반올림, trunc 내림)
    v_result := trunc(v_result);
    dbms_output.put_line(v_result);

end;