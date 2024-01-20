import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //백설 공주와 일곱 난쟁이
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        for(int i=0;i<8;i++){
            for(int j=i+1;j<9;j++){
                if(i == j) continue;

                if((sum-(arr[i]+arr[j])) == 100){
                    arr[i] = 0;
                    arr[j] = 0;
                    for(int k=0;k<9;k++){
                        if(k != i && k != j) System.out.println(arr[k]);
                    }
                }
            }
        }
    }
}