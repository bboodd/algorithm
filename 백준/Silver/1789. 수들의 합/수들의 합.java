import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	//수들의 합
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long S = Long.parseLong(br.readLine());
		
		int n = 1;
		
		int count = 0;
		
		while(true) {
			if(n > S) {
				break;
			}
			
			S -= n;
			n++;
			count++;
		}
		
		System.out.println(count);
	}
}