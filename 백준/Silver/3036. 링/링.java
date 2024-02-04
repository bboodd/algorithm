import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    //링
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int firstRing = Integer.parseInt(st.nextToken());
        
        for(int i=1; i<n; i++) {
            int ring = Integer.parseInt(st.nextToken());
            
            int gcd = gcd(firstRing, ring);
            
            sb.append(firstRing/gcd).append('/').append(ring/gcd).append('\n');
            
        }
        
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