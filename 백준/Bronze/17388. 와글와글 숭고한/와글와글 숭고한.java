import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];

        for(int i=0;i<3;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        String wrong = "";
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
        }

        if(sum<100){
            int min = 100;
            int index = 0;
            for(int i=0;i<arr.length;i++) {
                if(min>arr[i]){
                    min = arr[i];
                    index = i;
                }
            }

            if(index == 0){
                System.out.println("Soongsil");
            } else if(index == 1){
                System.out.println("Korea");
            } else{
                System.out.println("Hanyang");
            }
        } else{
            System.out.println("OK");
        }
    }
}