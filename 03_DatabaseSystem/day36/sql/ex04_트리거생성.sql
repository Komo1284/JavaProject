-- 트리거
-- 테이블에 특정 상황 (= 이벤트)이 발생시 실행되는 프로시저
create or replace trigger per_tri
    after delete or update on person   -- [after | before] [insert | update | delete] on [테이블명];
    for each row
declare
    v_action varchar2(20);
begin
    if deleting then        -- deleting : 삭제가 발생한 경우 '참'
        v_action := '삭제';
    elsif updating then     -- updating : 수정이 발생한 경우 '참'
        v_action := '수정';
    end if;                 -- inserting : 입력이 발생한 경우 '참'
    
    
    -- :old는 trigger 발생 전 데이터
    -- :new는 trigger 발생 후 데이터
    insert into person_back values(:old.name, :old.height, :old.birth, v_action);  
        
    dbms_output.put_line('트리거 실행 완료~');
end;