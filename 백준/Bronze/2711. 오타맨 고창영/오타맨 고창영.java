import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            String temp = "";

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            String line = st.nextToken();

            for(int j=0;j<line.length();j++){
                if(j+1 == n){
                    continue;
                } else{
                    temp += line.charAt(j);
                }
            }

            System.out.println(temp);
        }
    }
}