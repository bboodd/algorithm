import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int mid = 0;
        int max = 0;

        int sum = 0;
        int[] arr = new int[1001];

        for(int i=0;i<10;i++){
            int num = Integer.parseInt(br.readLine());
            sum += num;
            arr[num]++;
        }

        for(int i=0;i<1001;i++){
            if(max<arr[i]){
                max = arr[i];
                mid = i;
            }
        }

        System.out.println((sum/10) + "\n" + mid);
    }
}