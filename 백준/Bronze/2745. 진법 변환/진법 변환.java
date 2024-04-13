import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        int radix = Integer.parseInt(st.nextToken());

        System.out.println(Integer.parseInt(str, radix));
    }
}