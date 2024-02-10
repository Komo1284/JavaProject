-- 선택문 case - when
declare
    v_menu number := 3;
    v_msg varchar2(30);
begin
    case
        when v_menu = 1 then
            v_msg := '1번 선택';
        when v_menu = 2 then
            v_msg := '2번 선택';
        else
            v_msg := '없는 번호';
    end case;
    
    dbms_output.put_line(v_msg);
end;