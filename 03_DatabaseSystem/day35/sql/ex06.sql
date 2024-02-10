-- 조건문 if
declare
    v_name varchar2(10) := '홍길동';
    v_age number := 19;
    v_result varchar2(20);
begin
    if v_age >= 20 then
        v_result := '성인';
    elsif v_age >= 16 then
        v_result := '고등학생';
    elsif v_age >= 12 then
        v_reuslt := '중학생';
    else
        v_result := '미성년자';
    end if;
    
    dbms_output.put_line(v_name || '님은 ' || v_result || ' 입니다');
end;