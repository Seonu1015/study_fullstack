DESC EMP;
DESC DEPT;

-- �߰� ���� '�ش� ���� ����', '�߰� ���� ����', '�߰� ���� xx'
SELECT ENAME,
CASE
WHEN COMM IS NULL THEN '�ش� ���� ����'
WHEN COMM = 0 THEN '�߰� ���� ����'
ELSE CONCAT('�߰� ���� : ', TO_CHAR(COMM))
END AS COMM
FROM EMP;

SELECT EMPNO, ENAME,
CASE
WHEN COMM IS NULL THEN '�ش� ���� ����'
WHEN COMM = 0 THEN '�߰� ���� ����'
WHEN COMM > 0 THEN '�߰� ���� : ' || COMM
END AS COMM
FROM EMP;

-- EMP ���̺��� DEPT ���̺����� �������� �ִ� �μ���ȣ ���
SELECT DEPTNO
FROM EMP
INTERSECT
SELECT DEPTNO
FROM DEPT;

-- ������ �μ��� �ο���
SELECT EXTRACT(YEAR FROM HIREDATE) AS HIREYEAR, DEPTNO, COUNT(*)
FROM EMP
GROUP BY GROUPING SETS((EXTRACT(YEAR FROM HIREDATE)), (DEPTNO), (EXTRACT(YEAR FROM HIREDATE), DEPTNO));

SELECT TO_CHAR(HIREDATE, 'YYYY') AS HIRE_YEAR, DEPTNO, COUNT(*) AS CNT
FROM EMP
GROUP BY TO_CHAR(HIREDATE, 'YYYY'), DEPTNO;



-- �� �μ���, ������, �׷�ȭ�� �μ� + �� ������, ��ü �ο���, �޿� �Ѿ� (�׷�ȭ�� �μ� : GROUP_DEPT, �׷�ȭ�� ���� : GROUP_JOB)
SELECT DEPTNO, JOB, COUNT(*), SUM(SAL), GROUPING(DEPTNO) AS GROUP_DEPT, GROUPING(JOB) AS GROUP_JOB
FROM EMP
GROUP BY GROUPING SETS((DEPTNO), (JOB), (DEPTNO, JOB));

SELECT DECODE(GROUPING(DEPTNO), 1, 'GTOUP_DEPT', DEPTNO) AS DEPTNO,
       DECODE(GROUPING(JOB), 1, 'GTOUP_JOB', JOB) AS JOB,
       COUNT(*), SUM(SAL)
FROM EMP
GROUP BY CUBE(DEPTNO, JOB)
ORDER BY DEPTNO, JOB;

SELECT 
CASE
WHEN GROUPING(DEPTNO) = 1 THEN 'GROUP_DEPT'
ELSE TO_CHAR(DEPTNO)
END AS DEPTNO,
CASE
WHEN GROUPING(JOB) = 1 THEN 'GROUP_JOB'
ELSE JOB
END AS JOB,
COUNT(*), SUM(SAL)
FROM EMP
GROUP BY GROUPING SETS((DEPTNO), (JOB), (DEPTNO, JOB))
ORDER BY DEPTNO, JOB;

--------------------------------------------------------------------------------

-- EMP ���̺��� DEPT ���̺����� �������� �ִ� �μ���ȣ ��� (�����ϰ� �ذ��ϴ� ���)
SELECT DISTINCT EMP.DEPTNO
FROM EMP, DEPT
ORDER BY DEPT.DEPTNO, EMP.EMPNO;

SELECT E.EMPNO, E.ENAME, E.DEPTNO, D.DNAME, D.LOC
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO
ORDER BY D.DEPTNO, E.EMPNO;

SELECT E.EMPNO, E.ENAME, DEPT.DEPTNO, DEPT.DNAME, DEPT.LOC
FROM EMP E
INNER JOIN DEPT ON E.DEPTNO = DEPT.DEPTNO
ORDER BY DEPT.DEPTNO, E.EMPNO;

SELECT E.EMPNO, E.ENAME, DEPT.DEPTNO, DEPT.DNAME, DEPT.LOC
FROM EMP E
RIGHT OUTER JOIN DEPT ON E.DEPTNO = DEPT.DEPTNO
ORDER BY DEPT.DEPTNO, E.EMPNO;

SELECT E.ENAME, DEPT.DNAME
FROM EMP E
INNER JOIN DEPT ON E.DEPTNO = DEPT.DEPTNO
ORDER BY DEPT.DEPTNO, E.EMPNO;

SELECT *
FROM EMP;

-- EMP ���̺����� �ڽ��� ����� �̸��� ���ؼ� ���
SELECT E1.EMPNO, E1.ENAME, E1.JOB, E1.MGR, E2.ENAME AS MGR_NAME, E1.HIREDATE, E1.SAL, E1.COMM, E1.DEPTNO 
FROM EMP E1, EMP E2
WHERE E1.MGR = E2.EMPNO;

SELECT *
FROM SALGRADE;

-- SALGRADE ���̺��� SAL ����� �ݿ��ؼ� ���
SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, S.GRADE AS SAL_GRADE, E.COMM, E.DEPTNO
FROM EMP E, SALGRADE S
WHERE E.SAL >= S.LOSAL AND E.SAL <= S.HISAL
ORDER BY E.EMPNO;

SELECT E.ENAME, S.GRADE
FROM EMP E, SALGRADE S
WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL;

--------------------------------------------------------------------------------
SELECT *
FROM EMP E
LEFT OUTER JOIN EMP ON E.MGR = EMP.EMPNO;

SELECT *
FROM EMP E1
RIGHT OUTER JOIN EMP E2 ON E1.MGR = E2.EMPNO;

--------------------------------------------------------------------------------

SELECT *
FROM EMP E1
NATURAL JOIN EMP E2;

SELECT *
FROM EMP
NATURAL JOIN DEPT;

SELECT E.EMPNO, E.ENAME, E.MGR, DEPTNO, D.DNAME, D.LOC
FROM EMP E
NATURAL JOIN DEPT D;


SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, DEPTNO, D.DNAME, D.LOC
FROM EMP E
NATURAL JOIN DEPT D
ORDER BY DEPTNO, E.EMPNO;

SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, DEPTNO, D.DNAME, D.LOC
FROM EMP E
JOIN DEPT D USING(DEPTNO)
ORDER BY DEPTNO, E.EMPNO;


-- SALGRADE - HISAL�� �޴� ����� �ο� ���� ��޺��� ����غ���
SELECT S.GRADE, COUNT(*) AS TOTLA_COUNT
FROM EMP E, SALGRADE S
WHERE E.SAL = S.HISAL
GROUP BY S.GRADE
ORDER BY S.GRADE;


-- EMP ���̺����� DEPT ���̺��� ����� 'DEPT' ���� ������ ���� �μ� �̸��� ��ġ�� ����غ���
SELECT DEPT.DEPTNO, DEPT.DNAME, DEPT.LOC
FROM DEPT
FULL OUTER JOIN EMP ON DEPT.DEPTNO = EMP.DEPTNO
WHERE DEPT.DEPTNO IS NULL OR EMP.DEPTNO IS NULL;

-- EMP�� DEPT �����ؼ� JOB�� MANAGER�� �ֵ� ����غ���
SELECT *
FROM EMP E
JOIN DEPT D USING(DEPTNO)
WHERE JOB = 'MANAGER'
ORDER BY E.EMPNO;

