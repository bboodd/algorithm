import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //가장 긴 증가하는 부분 수열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        int[] arr = new int[A];
        int[] dp = new int[A];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < A;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }

        for(int i = 0; i < A;i++){

            for(int j=0;j < i;j++){

                if(arr[j] < arr[i] && dp[i] < dp[j] + 1){
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int max = 0;
        for(int i=0;i<A;i++){
            max = Math.max(dp[i], max);
        }
        System.out.println(max);
    }
}