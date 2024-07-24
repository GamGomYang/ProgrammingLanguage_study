
/*
 * 
 * 
 * 위 그림은 크기가 5인 정수 삼각형의 한 모습이다.

맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라. 아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.

삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 수는 모두 정수이며, 범위는 0 이상 9999 이하이다.

입력
첫째 줄에 삼각형의 크기 n(1 ≤ n ≤ 500)이 주어지고, 둘째 줄부터 n+1번째 줄까지 정수 삼각형이 주어진다.

출력
첫째 줄에 합이 최대가 되는 경로에 있는 수의 합을 출력한다.
 * 
 * 조금만 살펴보면 쉽게 풀 수 있는 문제다. 다만 가끔 위에서 아래로 내려오면서 최댓값 경로만 찾아서 하는 경우가 있는데 그렇게 하면 100% 오답이 난다. 또한 DP에 한 번 탐색한 값을 재활용(Memoization)하지 않고 불필요하게 재귀호출을 다 해주면 시간초과가 나니 이 점 유의하도록 하자.



알고리즘 [접근 방법]
 




 

정답률이 높은 것을 보아 아마 다들 쉽게 풀 수 있던 것 같다. 마침 삼각형으로 주어지니 그림으로 천천히 살펴보도록 하자.

 

먼저 삼각형을 입력받을 2차원 배열 arr와 경로 합을 갖을 DP배열, 이렇게 두 개가 있어야한다. 그리고 삼각형의 밑변, 즉 마지막 값은 DP배열에도 똑같이 저장해준다. 그림으로 보면 아래와 같다.

 


 

그리고 'DP를 위에서부터 탐색'하는 것이다.

 

맨 위에서 탐색해보자. 이 때 아래의 양쪽 값 중 최댓값을 찾아야 한다. 하지만, 위 그림에서 보듯이 위에서 두 번째 줄의 값 또한 비어있다. 그럼 재귀호출을 통해 다시 그 아래의 양쪽 값 중 최댓값을 찾는다.

 

이런식으로 반복하다보면 양쪽에 값이 있는 경우를 만나게 된다. 그럼 양쪽의 값 중 최댓값과 현재 위치의 배열 값을 더하여 DP에 저장해주면 된다. 간단하게 코드로 보자면 이렇다.

 

// depth는 깊이(행), idx는 인덱스(열)를 의미
 
int find(int depth, int idx) {
 
	// 만약 맨 밑(깊이)의 행에 도달하면 해당 인덱스를 반환한다.
	if(depth == N - 1) return dp[depth][idx];
    
	// 만약 아직 탐색하지 않은 위치라면 다음 행의 양쪽 열 중 최댓값을 구함
	if (dp[depth][idx] == null) {
		
		 바로 다음행의 인덱스와 그 오른쪽의 인덱스 중 
		 큰 값 찾아 dp에 현재 인덱스의 값과 더하여 저장
		
		dp[depth][idx] = max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx];
	}
	return dp[depth][idx];
 
}
 * 
 * 
 * 
 * 
 */


 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.IOException;
 import java.util.StringTokenizer;
  
 public class boj1932 {
  
     static int[][] arr;
     static Integer[][] dp;
     static int N;
  
     public static void main(String[] args) throws IOException {
  
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
         N = Integer.parseInt(br.readLine());
  
         arr = new int[N][N];
         dp = new Integer[N][N];
         StringTokenizer st;
         for (int i = 0; i < N; i++) {
             st = new StringTokenizer(br.readLine(), " ");
  
             for (int j = 0; j < i + 1; j++) {
                 arr[i][j] = Integer.parseInt(st.nextToken());
             }
         }
  
         for (int i = 0; i < N; i++) {
             dp[N - 1][i] = arr[N - 1][i];
         }
  
         System.out.println(find(0, 0));
  
     }
  
     static int find(int depth, int idx) {
         // 마지막 행일 경우 현재 위치의 dp값 반환
         if(depth == N - 1) return dp[depth][idx];
  
         // 탐색하지 않았던 값일 경우 다음 행의 양쪽 값 비교
         if (dp[depth][idx] == null) {
             dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx];
         }
         return dp[depth][idx];
  
     }
 }

