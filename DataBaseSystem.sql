SELECT E1.DEPNO, E1.ENAME, E1.SAL,
E2.DEPNO, E1.ENAME, E1.SAL

FROM EMP E1, EMP E2
WHERE E1.MGR = E2.MGR
AND E1.SAL > E2.SAL;

--표준 JOIN 1. INNER JOIN--

SELECT T1.ENAME, T1.NO, T2.NAME, T2.NO
FROM TABLE_1 T1 INNER JOIN TABLE_2 T2
USING(ENAME);

-- 서브쿼리: WHERE HAVING절 --

SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL>(SELECT AVG(SAL) 
FROM EMP);

/*
서브 쿼리에는 다양한 서브쿼리가 있다
1. 단일행 서브쿼리
2. 다중행 서브쿼리
3. 다중컬럼 서브쿼리
4. 상호연관 서브쿼리
*/

-- FROM 절 : 인라인 뷰--

SELECT E.EMPNO, E.ENAME, E.SAL, I.MAX_SAL
FROM EMP E, (SELECT DEPTNO, MAX(SAL) AS MAS_SAL FROM EMP
GROUP BY DEPTNO) I
WHERE E.DEPNO = I.DEPNO
AND E.SAL = I.SAL;

/*
집합 연산자
합집합 : 1. UNION(중복 X) 2. UNION ALL (중복 O)
교집합 : INTERSECT
차집합 : 1. MINUS 2. EXECPT */

SELECT EMPNO, ENAME, DEPTNO
FROM EMP
WHERE DEPTNO != 10
UNION
SELECT EMPNO, ENAME, DEPTNO
FROM EMP 
WHERE DEPNO != 20
-- 이렇게 두개의 메인쿼리를 UNION 하면 된다.--


-- 차집합 집합연산자 예제--

SELECT EMPNO, ENAME, DEPTNO
FROM EMP
WHERE DEPTNO != 10
MINUS
SELECT EMPNO, ENAME, DEPTNO
FROM EMP
WHERE DEPTNO != 20;

/*
TOP N QUERY
페이징 처리를 효과적으로 수행하기 위해 사용
1. ROWNUM
2. RANK
3. FETCH
4. TOP N( SQL SERVER) */

--TOP N QUERY ROWNUM--

SELECT ROWNUM, EMP.*
FROM EMP
WHERE SAL>= 1500;

-- ROWNUM에서 주의 할점 -> = 사용하면 안된다.--

-- 알맞은 ROWNUM 사용예제--
SELECT EMPNO, ENAME, DEPT, SAL
FROM EMP
WHERE ROWNUM <= 5;


--FETCH -> 출력될 행의 수를 제한하는 절--

SELECT EMPNO, ENAME, DEPNO, JOB, SAL
FROM EMP
ORDER BY SAL DESC
OFFSET 3 ROWNUM -- 상위 3개를 건너 뛴다--
FETCH FIRST 2 ROW ONLY;



SELECT ENAME, DEPNO 
FROM EMP
WHERE ENAME > 10;
ORDER BY DEPNO DESC


SELECT ENAME, DEPTNO
FROM EMP
WHERE ENAME > 20;


--0909 데이터베이스 시스템

/*
- DB의 특징
최신성
효율적인 공유
뷰 (from 절 inline view)
접근권한 (pk)
복구 (commit, rollback)
  만약에 table 이 두개가 있다면 두개가 동시에 갱신이 되어야 db갱신이 완료됨
  데이터에 대한 안정성을 높이기 위해서 -> 다중 데이터 테이블 유지

db는 메타데이터도 소유하고 있음
 데이터에 대한 데이터
 self discription(정보를 스스로 설명하는 역할)
-> dbms는 하나이지만 여러개의 db를 만들수 있다.
-> db사이의 관계를 나타낼때 ERD사용

offset : 메모리나 파일의 시작점으로부터 특정 위치까지의 상대적인 거리


-데이터 독립성
 HD MM과의 차이 
 HD : 비휘발성 속도가 느림 대용량 메모리 저장
 MM : 휘발성 속도가 빠르다 비싸다.
 
 예시 : 구글드라이브-> 만약에 내가 구글드라이브에 파일을 저장했다면 어느 드라이브에
 저장되어져 있는지 모른다 -> 독립성

-데이터 추상화(abstraction)
  db에서는 사용자에게 저장구조의 복잡성을 숨기고 간단하게 제시
  

 

*/








