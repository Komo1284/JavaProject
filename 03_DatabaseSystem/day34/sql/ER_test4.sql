-- 교수 테이블을 작성



CREATE TABLE PROFESSOR(
    IDX NUMBER DEFAULT SEQ_PRO_IDX.NEXTVAL,
    NAME VARCHAR2(50),
    GENDER VARCHAR2(6),
    EMAIL VARCHAR2(100) NOT NULL,
    
    CONSTRAINT PRO_PK_IDX PRIMARY KEY(IDX),
    CONSTRAINT PRO_UK_EMAIL unique(EMAIL),
    CONSTRAINT PRO_ck_gender check(gender in('남', '여'))
);

insert into professor values (default, '이진철', '남', 'lee@naver.com');
insert into professor values (default, '박선희', '여', 'hee@naver.com');
rollback;
