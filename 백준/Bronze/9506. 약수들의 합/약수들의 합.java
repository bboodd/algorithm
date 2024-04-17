import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int n =Integer.parseInt(br.readLine());

            if(n == -1) break;

            StringBuilder sb = new StringBuilder();

            sb.append(n).append(" = ").append("1 + ");

            int sum = 1;
            
            for(int i=2;i<n;i++){
                if(n%i==0){
                    sum += i;
                    sb.append(i).append(" + ");
                }
            }

            if(sum == n) System.out.println(sb.substring(0,sb.length()-2));
            else System.out.println(n + " is NOT perfect.");
        }
        
    }
}