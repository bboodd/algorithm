import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());

        int[] arr = {0,1,0,0};
        
        for(int i=0;i<m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(arr[a] == 1){
                arr[a] = 0;
                arr[b] = 1;
            } else if(arr[b] == 1){
                arr[b] = 0;
                arr[a] = 1;
            }
        }

        System.out.println(arr[1] == 1 ? 1 : arr[2] == 1 ? 2 : 3);
    }
}