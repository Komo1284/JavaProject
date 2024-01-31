-- 도구 -> 환경설정
-- 1. 환경 -> 인코딩 UTF-8
-- 2. 검색에 글꼴 -> 크기 조절

-- ※ system 계정은 db를 관리하기 위한 관리자 계정
-- 즉, 실습에 부적합하다

-- 1. 실습용 계정 생성
create user c##itbank IDENTIFIED by it;

-- 2. 권한 부여
grant dba, resource, connect to c##itbank;