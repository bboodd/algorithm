import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int answer = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int temp = 0;
			int s = Integer.parseInt(st.nextToken());
			for(int j=1;j<=s;j++) {
				if(s % j == 0) {
					temp++;
				}
			}
			if(temp == 2) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}