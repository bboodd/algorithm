import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	//거스름돈
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		if(n == 1 || n == 3) {
			System.out.println(-1);
			return;
		}
		
		if(n%5 == 0) {
			count += n/5;
		} else if(n%5 == 1){
			count += n/5 - 1 + 3;
		} else if(n%5 == 2) {
			count += n/5 + 1;
		} else if(n%5 == 3) {
			count += n/5 -1 + 4;
		} else {
			count += n/5 + 2;
		}
		
		System.out.println(count);
	}

}