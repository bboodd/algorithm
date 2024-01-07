import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<3;i++) {
            String[] line = br.readLine().split(" ");

            int count = 0;

            for(int j=0;j<line.length;j++) {
                if(line[j].equals("0")) {
                    count++;
                }
            }

            if(count == 4){
                System.out.println("D");
            } else if(count == 3){
                System.out.println("C");
            } else if(count == 2){
                System.out.println("B");
            } else if(count == 1){
                System.out.println("A");
            } else{
                System.out.println("E");
            }
        }
    }
}