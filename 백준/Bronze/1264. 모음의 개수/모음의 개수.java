import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String line = br.readLine();

            if(line.equals("#")){
                return;
            }

            int count = 0;

            for(int i=0;i<line.length();i++) {
                if(line.charAt(i) == 'a' || line.charAt(i) == 'e'
                || line.charAt(i) == 'i' || line.charAt(i) == 'o'
                || line.charAt(i) == 'u' || line.charAt(i) == 'A'
                || line.charAt(i) == 'E' || line.charAt(i) == 'I'
                || line.charAt(i) == 'O' || line.charAt(i) == 'U'){
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}