import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int d = 2;

        while(true){
            if(n == 1) break;

            if(n%d == 0){
                System.out.println(d);
                n /= d;
            } else{
                d++;
            }
        }
    }
}