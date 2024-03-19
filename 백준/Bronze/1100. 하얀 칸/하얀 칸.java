import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[8][8];

        for(int i=0;i<8;i++){
            String line = br.readLine();
            for(int j=0;j<8;j++){
                arr[i][j] = line.charAt(j);
            }
        }

        int count = 0;

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(i%2 == 0){
                    if(j%2 == 0 && arr[i][j] == 'F') count++;
                } else{
                    if(j%2 !=0 && arr[i][j] == 'F') count++;
                }
            }
        }

        System.out.println(count);
    }
}