import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    //점수 계산
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[8];

        int[] result = new int[5];

        int[] sortedArr = new int[8];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sortedArr[i] = arr[i];
        }

        Arrays.sort(sortedArr);

        int answer = 0;

        for(int i = 7; i > 2; i--){
            answer += sortedArr[i];
        }

        System.out.println(answer);

        for(int i = 7; i > 2 ; i--){

            int num = sortedArr[i];

            for(int j=0;j<sortedArr.length;j++){

                if(num == arr[j]){
                    result[7-i] = j+1;
                }
            }
        }

        Arrays.sort(result);

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

    }
}
