# �߰� ���� '�ش� ���� ����', '�߰� ���� ����', '�߰� ���� xx'
SELECT ENAME,
CASE
WHEN COMM IS NULL THEN '�ش� ���� ����'
WHEN COMM = 0 THEN '�ش� ���� ����'
ELSE CONCAT('�߰� ���� ', COMM)
END AS COMM
FROM EMP;