create SEQUENCE employee_seq
    start with 20240101
    INCREMENT by 1
    minvalue 20240101
    maxVALUE 99999999999999999
    NOCACHE;
    
create table employee (
    idx             number          default employee_seq.nextval,
    name            varchar2(30)    not null,
    position        varchar2(10)    not null,
    gender          varchar2(6),
    birth           date            not null,
    h_date          date            not null,
    phone           varchar2(15)    not null,
    email           varchar2(60)    not null,
    salary          number          not null,
    dep_name        varchar2(30)    not null,
    dep_create      date            not null,
    dep_phone       varchar2(15)    not null,
    dep_email       varchar2(60)    not null,
    
    CONSTRAINT emp_pk_idx primary key(idx),
    CONSTRAINT emp_ck_gender check(gender in('남', '여'))
);

drop table employee;