import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    //나는 요리사다
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = 1;

        int[] result = new int[2];

        for(int i=0;i<5;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for(int j=0;j<4;j++){
                sum += Integer.parseInt(st.nextToken());
            }

            if(result[1] < sum){
                result[1] = sum;
                result[0] = num;
            }

            num++;
            sum = 0;
        }

        System.out.println(result[0] + " " + result[1]);

    }
}