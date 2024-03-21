import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[n+1][3];

        dp[0][0] = 1;
        dp[1][0] = 1;
        dp[1][1] = 1;
        dp[1][2] = 1;

        int mod = 9901;

        for(int i=2;i<=n;i++){
            dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2]) % mod;
            dp[i][1] = (dp[i-1][0] + dp[i-1][2]) % mod;
            dp[i][2] = (dp[i-1][0] + dp[i-1][1]) % mod;
        }    

        int result = 0;
        for(int x : dp[n]){
            result += x;
            result %= mod;
        }

        System.out.println(result);

    }
}