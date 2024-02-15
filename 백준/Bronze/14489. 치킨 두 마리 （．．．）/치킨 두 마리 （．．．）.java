import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //치킨 두 마리
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int price = Integer.parseInt(br.readLine());

        if(a+b >= (price*2)){
            System.out.println((a+b)-(price*2));
        } else{
            System.out.println(a+b);
        }


    }
}