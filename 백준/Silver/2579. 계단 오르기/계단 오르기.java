import java.util.Scanner;

public class Main {
	//계단 오르기
	
	static int[] stairs;
	static Integer[] dp;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		stairs = new int[N+1];
		dp = new Integer[N+1];
		for(int i=1;i<=N;i++) {
			stairs[i] = sc.nextInt();
		}
		
		dp[0] = stairs[0];
		dp[1] = stairs[1];
		
		if(N>=2) {
			dp[2] = stairs[1] + stairs[2];
		}
		
		System.out.println(game(N));
	}
	
	private static int game(int n) {
		if(dp[n] == null) {
			dp[n] = Math.max(game(n-2), game(n-3) + stairs[n-1]) + stairs[n];
		}
		return dp[n];
	}

}