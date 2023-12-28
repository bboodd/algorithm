import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String line = br.readLine();

            if(line.equals("END")){
                return;
            }

            StringBuilder result = new StringBuilder();

            for(int i=0;i<line.length();i++) {
                result.append(line.charAt(line.length() - i - 1));
            }

            System.out.println(result);
        }
    }
}