import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //폴리오미노
    public static void main(String[] args) throws IOException {

        String p1 = "AAAA";
        String p2 = "BB";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String result = input.replace("XXXX", p1).replace("XX", p2);

        boolean answer = true;

        for(int i=0; i<result.length(); i++) {
            if(result.charAt(i) == 'X') {
                answer = false;
            }
        }

        if(answer){
            System.out.println(result);
        } else {
            System.out.println(-1);
        }

    }


}
