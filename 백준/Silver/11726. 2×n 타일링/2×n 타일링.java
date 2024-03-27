import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int d = 10007;

        int[] dp = new int[n+1];

        dp[0] = dp[1] = 1;

        for(int i=2;i<=n;i++){
            dp[i] = (dp[i-1] + dp[i-2]) % d;
        }

        System.out.println(dp[n]);
    }
}