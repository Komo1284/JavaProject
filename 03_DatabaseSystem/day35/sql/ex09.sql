create table person_test (
    name varchar2(20),
    age number,
    adult varchar2(20)
);

declare
    v_name varchar2(20);
    v_year number;
    v_birth number;
    v_adult varchar2(20) := '미성년자';
    v_age number;
begin
    -- 특정 테이블에서 필요한 값을 가져온다
    select name, extract(year from birth)
        into v_name, v_year
        from person
        where name = '김수진';
        
    -- 필요한 로직을 작성한다 (ex 날짜로 나이를 계산 후 성인/미성년 판별)
    v_age := extract(year from sysdate) - v_year;
    
    if v_age >= 19 then
        v_adult := '성인';
    end if;
    
    -- 로직 처리 후 가공된 데이터를 필요한 테이블에 insert
    insert into person_test values(v_name, v_age, v_adult);
    commit;
        
    dbms_output.put_line(v_age);
end;