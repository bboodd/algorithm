import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;

        int prev = -1;

        for(int i=0;i<n;i++) {
            int milk = Integer.parseInt(st.nextToken());

            if(count == 0 && milk == 0){
                count++;
                prev = milk;
            } else if(milk == 0 && prev == 2){
                count++;
                prev = milk;
            } else if(milk == 1 && prev == 0){
                count++;
                prev = milk;
            } else if(milk == 2 && prev == 1){
                count++;
                prev = milk;
            }
        }

        System.out.println(count);
    }
}