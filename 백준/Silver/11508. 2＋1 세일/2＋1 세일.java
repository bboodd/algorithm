import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    //2+1세일
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int answer = 0;
        int cnt = 0;

        for(int i=n-1; i>=0; i--){
            cnt++;
            if(cnt == 3){
                cnt = 0;
                continue;
            } else{
                answer+=arr[i];
            }
        }

        System.out.println(answer);
    }
}