import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int prev = Integer.parseInt(st.nextToken());
        int score = prev;
        
        for(int i=1;i<n;i++){
            int answer = Integer.parseInt(st.nextToken());

            if(answer == 0){
                prev = 0;
            } else{
                prev += 1;
                score += prev;
            }
        }

        System.out.println(score);
    }
}