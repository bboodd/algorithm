import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //Darius님 한타 안 함?
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] kda = br.readLine().split("/");
        
        int k = Integer.parseInt(kda[0]);
        int d = Integer.parseInt(kda[1]);
        int a = Integer.parseInt(kda[2]);
        
        if(k+a < d || d == 0){
            System.out.println("hasu");
        } else{
            System.out.println("gosu");
        }


    }
}