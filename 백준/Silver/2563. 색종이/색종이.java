import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] draw = new int[101][101];

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());

            for(int j=col;j<col+10;j++){
                for(int k=row;k<row+10;k++){
                    if(draw[j][k] == 0) sum++;
                    draw[j][k]++;
                }
            }
        }

        System.out.println(sum);
    }
}