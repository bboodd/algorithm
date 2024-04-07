import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[26];
        int count = 9;

        for(int i=0;i<n;i++){

            String str = br.readLine();

            for(int j=0;j<str.length();j++){
                char c = str.charAt(j);
                arr[c-'A'] += (int)Math.pow(10, str.length()-1-j);
            }
        }

        Arrays.sort(arr);


        int index = 9;
        int sum = 0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] == 0) continue;

            sum += arr[i]*index;
            index--;
        }

        System.out.println(sum);
        
    }
}