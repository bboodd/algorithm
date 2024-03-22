import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    static int[][] dp = new int[30][30];

    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            String[] arr = br.readLine().split(" ");

            int n = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);
            
            System.out.println(combi(m, n));
        }
    }

    static int combi(int n, int r){
        if(dp[n][r] > 0){
            return dp[n][r];
        }

        if(n == r || r == 0){
            return dp[n][r] = 1;
        }

        return dp[n][r] = combi(n-1,r-1) + combi(n-1, r);
    }
}