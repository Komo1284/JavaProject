CREATE TABLE CLASS(
    IDX NUMBER DEFAULT SEQ_IDX.NEXTVAL,
    NAME VARCHAR2(60) not null,
    C_DATE DATE,
    TOTAL NUMBER,
    
    CONSTRAINT CLASS_PK_IDX PRIMARY KEY(IDX),
    CONSTRAINT CLASS_uk_name unique(name)
);

create table student_class(
    stu_idx number,
    class_idx number,
    constraint STU_FK_IDX foreign key(stu_idx) references student(idx),
    constraint CLS_FK_IDX foreign key(class_idx) references class(idx)
);

CREATE TABLE STUDENT(
    IDX NUMBER DEFAULT STUDENT_IDX.NEXTVAL,
    NAME VARCHAR2(50),
    GRADE NUMBER NOT NULL,
    GENDER VARCHAR2(6),
    EMAIL VARCHAR2(100) NOT NULL,
    
    CONSTRAINT STUDENT_PK_IDX PRIMARY KEY(IDX),
    CONSTRAINT STUDENT_UK_EMAIL unique(EMAIL),
    CONSTRAINT STUDENT_ck_gender check(gender in('남', '여'))
);

CREATE TABLE PROFESSOR(
    IDX NUMBER DEFAULT SEQ_PRO_IDX.NEXTVAL,
    NAME VARCHAR2(50),
    CLASS_IDX NUMBER,
    GENDER VARCHAR2(6),
    EMAIL VARCHAR2(100) NOT NULL,
    
    CONSTRAINT PRO_PK_IDX PRIMARY KEY(IDX),
    CONSTRAINT PRO_UK_EMAIL unique(EMAIL),
    constraint pro_FK_IDX foreign key(class_idx) references class(idx),
    CONSTRAINT PRO_ck_gender check(gender in('남', '여'))
);