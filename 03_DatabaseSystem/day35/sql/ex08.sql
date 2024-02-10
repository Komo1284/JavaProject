-- 연습)
-- person 테이블에서 아무 사람을 가져온다
-- 그 사람의 나이를 구해서 '성인/미성년자'를 구분해서 출력

declare
    v_date date;
    v_cur date := sysdate;
    v_result number;
    v_re varchar2(20);
begin
    select birth into v_date
    from person where name = '홍길동';
    v_result := v_cur - v_date;
    v_result := trunc(v_result / 365);
    
    if v_result >= 19 then
        v_re := '성인';
    else
        v_re := '미성년자';
    end if;
    
    dbms_output.put_line('홍길동은 '||v_re||' 입니다');
    
end;