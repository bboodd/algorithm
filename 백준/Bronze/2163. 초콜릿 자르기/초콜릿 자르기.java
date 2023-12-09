import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    //초콜릿 자르기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken()), num2 = Integer.parseInt(st.nextToken());

        int cnt = 0;

        int min = Math.min(num1, num2);
        
        int max = Math.max(num1, num2);
        
        cnt += min-1;
        cnt += (max-1) * min;

        System.out.println(cnt);
    }
}