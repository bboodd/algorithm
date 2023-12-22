import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int s1 = Integer.parseInt(br.readLine());
        int s2 = Integer.parseInt(br.readLine());
        int s3 = Integer.parseInt(br.readLine());
        int sum = s1 + s2 + s3;

        if(sum == 180){

            if(s1 == 60 && s2 == 60 && s3 == 60){
                System.out.println("Equilateral");
            } else if(s1 == s2 || s1 == s3 || s2 == s3){
                System.out.println("Isosceles");
            } else{
                System.out.println("Scalene");
            }

        } else{
            System.out.println("Error");
        }
    }
}