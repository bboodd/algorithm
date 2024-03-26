import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            String[] arr = br.readLine().split(" ");

            double d = Double.parseDouble(arr[0]);

            for(int j=1;j<arr.length;j++){
                if(arr[j].equals("@")) d *=3;
                else if(arr[j].equals("%")) d += 5;
                else if(arr[j].equals("#")) d -= 7;
            }
            
            System.out.printf("%.2f",d);
            System.out.println();
        }
    }
}