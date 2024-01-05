import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //베르트랑 공준
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int num = Integer.parseInt(br.readLine());

            if(num == 0){
                return;
            }

            int count = 0;
            for(int i = num+1;i<=2*num;i++){
                boolean isPrime = true;

                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime) count++;
            }

            System.out.println(count);
        }
    }
}
