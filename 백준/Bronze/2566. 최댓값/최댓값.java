import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = -1;
        int col = -1;
        int row = -1;
        
        for(int i=1;i<10;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1;j<10;j++){
                int n = Integer.parseInt(st.nextToken());

                if(n>max){
                    max = n;
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println(max + "\n" + row + " " + col);
    }
}