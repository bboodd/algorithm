import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    //열 개씩 끊어 출력하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int cnt = 0;

        String temp = "";

        for(int i=0;i<str.length();i++) {
            temp += str.charAt(i);

            if(temp.length() == 10){
                System.out.println(temp);
                temp = "";
            }
        }

        if(!temp.isEmpty()){
            System.out.println(temp);
        }

    }
}