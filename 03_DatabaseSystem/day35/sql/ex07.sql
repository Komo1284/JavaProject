declare
    -- date는 년/월/일만, timestamp는 시/분/초 까지 추가
    v_birth timestamp := '2005-03-25 13:50:21';
begin
    dbms_output.put_line(v_birth);   
    dbms_output.put_line(extract(year from v_birth));
    dbms_output.put_line(extract(month from v_birth));
    dbms_output.put_line(extract(day from v_birth));
    dbms_output.put_line(extract(hour from v_birth));
    dbms_output.put_line(extract(minute from v_birth));
    dbms_output.put_line(extract(second from v_birth));



end;