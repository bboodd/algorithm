import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    //홀수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[7];

        for(int i=0;i<7;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int min = 0;
        int sum = 0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] % 2 != 0){
                if(min == 0) min = arr[i];

                sum += arr[i];
            }
        }


        if(min == 0){
            System.out.println(-1);
        } else{
            System.out.println(sum + "\n" + min);
        }

    }
}