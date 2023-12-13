import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //0의 개수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int count = 0;

            for(int j=N;j<=M;j++){
                String str = Integer.toString(j);

                for(int k=0;k<str.length();k++){
                    if(str.charAt(k) == '0'){
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
