import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        String answer = "";
        
        int length = 0;
        
        for(int i=0;i<n;i++){
            arr[i] = br.readLine();
            length = arr[i].length();
        }
        
        for(int i=0;i<length;i++){
            char temp = arr[0].charAt(i);
            boolean flag = true;

            for(int j=1;j<n;j++){
                if(temp != arr[j].charAt(i)){
                    flag = false;
                }
            }
        
            if(flag){
                answer+=temp;
            } else{
                answer+="?";
            }
        }

        System.out.println(answer);
    }
}