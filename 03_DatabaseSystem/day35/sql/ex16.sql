-- 커서 (cursor) : 테이블을 가리키는 객체

declare
    cursor per_cur is
        select * from person where height >= 170;
begin
    for per in per_cur loop
        dbms_output.put_line(per.name || ' : ' || per.height);
    end loop;
end;