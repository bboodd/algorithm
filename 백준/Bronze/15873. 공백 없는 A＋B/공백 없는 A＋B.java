import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //공백 없는 A+B
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();

        char a;
        char b;

        if(num.length() == 4){
            System.out.println(20);
        } else if(num.length() == 3){
            if(num.charAt(1) == '0'){
                System.out.println(10 + Character.getNumericValue(num.charAt(2)));
            } else{
                System.out.println(10 + Character.getNumericValue(num.charAt(0)));
            }
        } else{
            System.out.println(Character.getNumericValue(num.charAt(0)) + Character.getNumericValue(num.charAt(1)));
        }

    }
}