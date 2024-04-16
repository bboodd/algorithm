import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cross_count = 1;
        int prev_count_sum = 0;
        
        while(true){
            if(n <= cross_count+prev_count_sum){

                if(cross_count % 2 == 1){
                    System.out.println((cross_count - (n-prev_count_sum -1)) + "/" + (n-prev_count_sum));
                    break;
                } else{
                    System.out.println((n-prev_count_sum) + "/" + (cross_count - (n-prev_count_sum-1)));
                    break;
                }
            } else{
                prev_count_sum += cross_count;
                cross_count++;
            }
        }
    }
}