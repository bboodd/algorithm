import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //단어 뒤집기 2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        StringBuilder sb = new StringBuilder();

        StringBuilder reverse = new StringBuilder();

        boolean flag = false;

        for(int i=0; i<line.length();i++){

            char c = line.charAt(i);

            if(flag){
                sb.append(c);
                if(c == '>') flag = false;
            } else{
                if(c == ' ' || c == '<'){
                    if(c =='<') flag = true;

                    sb.append(reverse.reverse().toString());

                    sb.append(c);

                    reverse = new StringBuilder();
                } else {
                    reverse.append(c);
                }
            }

        }

        if(reverse.length() > 0){
            sb.append(reverse.reverse().toString());
        }

        System.out.println(sb);
    }
}