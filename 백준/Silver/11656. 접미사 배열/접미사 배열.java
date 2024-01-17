import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        String[] words = new String[word.length()];

        for(int i = 0; i < words.length; i++){
            words[i] = word.substring(i);
        }

        Arrays.sort(words);

        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
}