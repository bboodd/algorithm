import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder(str);

        if(str.equals(sb.reverse().toString())){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}