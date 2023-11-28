import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	//세탁소 사장 동혁
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int[] answer;
		
		int q = 25;
		int d = 10;
		int n = 5;
		int p = 1;
		
		for(int i=0;i<T;i++) {
			answer = new int[4];
			
			int c = Integer.parseInt(br.readLine());
			
			while(c>0) {
				if(c>=q) {
					c -= q;
					answer[0] += 1;
					continue;
				}
				if(c>=d) {
					c -= d;
					answer[1] += 1;
					continue;
				}
				if(c >= n) {
					c -= n;
					answer[2] += 1;
					continue;
				}
				if(c >= p) {
					c -= p;
					answer[3] += 1;
					continue;
				}
			}
			
			for(int j=0;j<4;j++) {
				System.out.print(answer[j] + " ");
			}
			System.out.println();
		}
	}
}