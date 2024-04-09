import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0 ;
        double sum = 0;
        
        for(int i=0;i<20;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String str = st.nextToken();
            double a = Double.parseDouble(st.nextToken());
            String b = st.nextToken();

            if(b.equals("P")){
                continue;
            } else{
                switch(b.charAt(0)){
                    case 'A':
                        if(b.charAt(1) == '+') sum += (4.5*a);
                        else sum += a*4;
                        break;
                    case 'B':
                        if(b.charAt(1) == '+') sum += a*3.5;
                        else sum += a*3;
                        break;
                    case 'C':
                        if(b.charAt(1) == '+') sum += a*2.5;
                        else sum += a*2;
                        break;
                    case 'D':
                        if(b.charAt(1) == '+') sum += a*1.5;
                        else sum += a*1;
                        break;
                    case 'F':
                        break;
                }
                count+=a;
            }
        }

        System.out.printf("%.6f",sum/count);
    }
}