import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //기타줄
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int six = 1001;
        int one = 1001;

        for(int i=0;i<m;i++) {
            st = new StringTokenizer(br.readLine());
            six = Math.min(six, Integer.parseInt(st.nextToken()));
            one = Math.min(one, Integer.parseInt(st.nextToken()));

            if((one*6) < six){
                six = one*6;
            }
        }

        int answer = ((n/6)*six) + ((n%6)*one);

        int answer2 = 0;

        if(n%6 == 0){
            answer2 = (n/6)*six;
        } else{
            answer2 = ((n/6)+1)*six;
        }

        System.out.println(Math.min(answer, answer2));
    }
}
