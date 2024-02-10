-- 프로시저
-- begin 부터 end 사이에 실행되는 프로그래밍 코드를 의미
-- 이러한 프로시저는 즉시 사용해서 사용도 가능하며
-- 저장해놓고 재사용 할 수도 있다. 이를 '저장된 프로시저'라고 한다
-- ※ 자바로 치면 void형 메서드

-- 1. 프로시저 생성
create or replace procedure test1 as
begin
    for i in 1..5 loop
        dbms_output.put_line(i || ' : Hello World!!!');
    end loop;
end;

-- 2. 실행은 ex20.sql에서