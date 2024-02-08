-- 연산 및 자동 형변환
-- dual : oracle DB에서 이미 만들어져 있는 임시 테이블
-- 보통 연산이나 함수의 결과를 바로 확인하고자 할 때 사용
select 100 + 200 from dual;

-- 문자열('')이라도 내용이 숫자면 숫자로 연산
select '100' + '200' from dual;

-- 문자열이면 연산 불가능
select 'hello' + 'world' from dual;

select '100' + 200 from dual;

select 100 + 3.14 from dual;

-- 강제 형변환
-- to_char() : 문자로 형변환
select to_char(10) from dual;

-- to_number() : 숫자로 형변환
select to_number('1000') from dual;

-- to_date() : 날짜로 형변환
select to_date('20240207') from dual;
select to_date('2024-02-07') from dual;
select to_date('2024/02/07') from dual;

select to_char(sysdate, 'yyyy $ mm $ dd') from dual;
select to_char(to_date('20240207'), 'yyyy $ mm % dd ') from dual;

select sysdate from dual;
select to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss') from dual;