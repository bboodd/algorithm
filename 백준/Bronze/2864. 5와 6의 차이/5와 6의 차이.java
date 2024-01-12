import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();

        String b = st.nextToken();

        StringBuilder maxA = new StringBuilder();

        StringBuilder minA = new StringBuilder();

        StringBuilder maxB = new StringBuilder();

        StringBuilder minB = new StringBuilder();

        for(int i=0;i<a.length();i++) {
            char temp = a.charAt(i);

            if(temp == '5'){
                minA.append(temp);
                maxA.append('6');
            } else if(temp == '6'){
                minA.append('5');
                maxA.append(temp);
            } else{
                minA.append(temp);
                maxA.append(temp);
            }
        }

        for(int i=0;i<b.length();i++){
            char temp = b.charAt(i);

            if(temp == '5'){
                minB.append(temp);
                maxB.append('6');
            } else if(temp == '6'){
                minB.append('5');
                maxB.append(temp);
            } else{
                minB.append(temp);
                maxB.append(temp);
            }
        }

        System.out.println((Integer.parseInt(minA.toString()) + Integer.parseInt(minB.toString())) + " " + (Integer.parseInt(maxA.toString()) + Integer.parseInt(maxB.toString())));
    }
}