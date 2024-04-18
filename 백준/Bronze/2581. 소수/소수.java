import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int min = 10001;
        int sum = 0;

        for(int i=m;i<=n;i++){
            boolean flag = true;

            if(i == 1) flag = false;

            for(int j=2;j<=i/2;j++){
                if(i%j == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag){
                min = Math.min(min,i);
                sum += i;
            }
        }

        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum + "\n" + min);
        }
    }
}