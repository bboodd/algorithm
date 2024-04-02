import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        int[] arr2 = new int[123];

        for(int i=0;i<n;i++){
            arr[i] = br.readLine();
        }

        for(int i=0;i<n;i++){
            int c = arr[i].charAt(0);
            arr2[c]++;
        }

        String answer = "";
        for(int i=97;i<123;i++){
            if(arr2[i] >= 5){
                answer+=(char)i;
            }
        }

        if(answer.equals("")){
            System.out.println("PREDAJA");
        } else{
            System.out.println(answer);
        }

        
    }
}