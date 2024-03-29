import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = "";

        for(int i=0;i<str1.length();i++){
            char c = str1.charAt(i);

            if(Character.isLowerCase(c)){
                c += 13;
                if(c>122) c -= 26;
                
                str2 += Character.toString(c);
            } else if( Character.isUpperCase(c)){
                c += 13;
                if(c>90) c -= 26;

                str2 += Character.toString(c);
            } else{
                str2 += c;
            }
        }

        System.out.println(str2);
    }
}