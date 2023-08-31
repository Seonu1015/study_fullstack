# 추가 수당 '해당 사항 없음', '추가 수당 없음', '추가 수당 xx'
SELECT ENAME,
CASE
WHEN COMM IS NULL THEN '해당 사항 없음'
WHEN COMM = 0 THEN '해당 사항 없음'
ELSE CONCAT('추가 수당 ', COMM)
END AS COMM
FROM EMP;