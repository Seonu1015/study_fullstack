SELECT *
FROM EMP;

CREATE TABLE EMP_TEMP AS SELECT * FROM EMP;

SELECT * 
FROM EMP_TEMP;

CREATE TABLE FOOD (
    id NUMBER(4),
    name varchar(10) NOT NULL,
    PRIMARY KEY (id)
);

SELECT *
FROM FOOD;