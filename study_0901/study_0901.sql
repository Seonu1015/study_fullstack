DESC EMP;

DESC DEPT;

INSERT INTO EMP(EMPNO, ENAME, SAL, DEPTNO)
VALUES (8546, 'TOAD', 2580, 20);

INSERT INTO DEPT(DEPTNO)
VALUES (50);

SELECT *
FROM DEPT;

INSERT INTO EMP(EMPNO, ENAME, JOB, SAL, DEPTNO)
VALUES (9919, 'QUERY', 'MANAGER', 5000, 40);

UPDATE EMP
SET JOB = 'CEO'
WHERE EMPNO = 9999;

UPDATE EMP
SET SAL = SAL * 1.1, JOB = 'SALESPER'
WHERE COMM IS NOT NULL AND JOB = 'SALESMAN';

UPDATE EMP
SET JOB = 'SALEPSN'
WHERE JOB = 'SALESPER';

UPDATE EMP
SET SAL = SAL / 1.1
WHERE COMM IS NOT NULL;

DELETE FROM EMP
WHERE HIREDATE IS NULL;

ROLLBACK;



SELECT *
FROM EMP;

