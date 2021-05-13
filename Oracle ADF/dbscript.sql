CREATE TABLE TO_DO_ALL (
TO_DO_ID NUMBER(38,0) PRIMARY KEY,
TASK_NAME VARCHAR2(100) NOT NULL,
TASK_DESCRIPTION VARCHAR2(500),
DUE_DATE DATE,
PRIORITY VARCHAR2(10),
COMPLETED VARCHAR2(1),
CREATED_ON DATE,
CREATED_BY VARCHAR2(50),
MODIFIED_ON DATE,
MODIFIED_BY VARCHAR2(50),
VERSION_NUMBER NUMBER(38,0)
);

CREATE SEQUENCE TO_DO_SEQ START WITH 1;