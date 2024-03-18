import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String[] temp = br.readLine().split(" ");

       int diagonal = Integer.parseInt(temp[0]);
       int height = Integer.parseInt(temp[1]);
       int width = Integer.parseInt(temp[2]);

       //소수점이 나올 경우, 그 수보다 작은면서 가장 큰 정수 출력 (floor)
       double res = Math.sqrt(Math.pow(diagonal, 2) / (Math.pow(height, 2) + Math.pow(width, 2)));
        System.out.print((int)Math.floor(res*height) + " ");
        System.out.println((int)Math.floor(res*width));
    }
}