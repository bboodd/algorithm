import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[15];

        for(int i=0; i<arr.length; i++) {
            arr[i] = "";
        }

        for(int i=0;i<5;i++) {
            String word = br.readLine();

            for(int j=0;j<word.length();j++) {
                arr[j]+=word.charAt(j);
            }
        }

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
    }
}