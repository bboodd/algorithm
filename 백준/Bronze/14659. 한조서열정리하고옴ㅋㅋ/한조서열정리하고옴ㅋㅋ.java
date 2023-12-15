import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //한조서열정리하고옴ㅋㅋ
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] arr = new int[T];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < T;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;

        for(int i = 0; i < T;i++){

            int num = arr[i];

            int count = 0;

            for(int j=i+1;j<T;j++){

                if(num > arr[j]){
                    count++;
                } else{
                    break;
                }
            }

            answer = Math.max(answer, count);
        }

        System.out.println(answer);
    }
}
