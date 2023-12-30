import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int count = 1;
        String[] arr = new String[5];
        for(int i=0;i<5;i++) {
            String line = br.readLine();

            arr[i] = line;
        }
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i].contains("FBI")){
                sb.append(count).append(" ");
            }
            count++;
        }

        if(sb.length() == 0){
            sb.append("HE GOT AWAY!");
        }

        System.out.println(sb);
    }
}