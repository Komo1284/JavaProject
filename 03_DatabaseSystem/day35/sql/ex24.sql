-- 프로시저의 반환값은 매개변수에 세팅한다

create or replace procedure test4(
    -- 매개변수
    n1 in number,       -- 호출시 저장받을 변수
    n2 number,          -- 생략시 기본 in
    result out number   -- 결과를 반하ㅗㄴ할 변수
) as
    -- 지역변수
    v_sum number := 0;
begin  
    -- 실행 로직
    for i in n1..n2 loop
        v_sum := v_sum + i;
    end loop;
    
    result := v_sum;
end;

-- 실행은 ex24.sql에서