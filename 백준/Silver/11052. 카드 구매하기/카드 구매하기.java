import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	//카드 구매하기
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] card = new int[n+1];
		int[] dp = new int[n+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=1;i<=n;i++) {
			card[i] = Integer.parseInt(st.nextToken());
			dp[i] = Integer.MIN_VALUE;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				dp[i] = Math.max(dp[i], card[j] + dp[i-j]);
			}
		}
		
		System.out.println(dp[n]);
	}

}