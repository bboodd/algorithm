import java.io.IOException;
import java.util.Scanner;

public class Main {
	//팩토리얼 0의 개수
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int count = 0;
		while(N >= 5) {
			count += N / 5;
			N /= 5;
		}
		System.out.println(count);
	}

}