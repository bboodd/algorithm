import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    //백대열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcd = gcd(a,b);

        sb.append(a/gcd).append(":").append(b/gcd);

        System.out.println(sb);

    }

    static int gcd(int a, int b){ //최대공약수
        int r;

        while(b!=0){
            r = a%b;
            a = b;
            b = r;
        }

        return a;
    }
}