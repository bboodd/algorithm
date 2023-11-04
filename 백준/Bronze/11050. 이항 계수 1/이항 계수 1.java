import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	//이항계수 1
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N+1][K+1];
		
		for(int i=0;i<N+1;i++) {
			for(int j=0;j<K+1;j++) {
				if(j == 0 || i == j) {
					arr[i][j] = 1;
				}
			}
		}
		
		for(int i=1;i<N+1;i++) {
			for(int j=1;j<K+1;j++) {
				arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
			}
		}
		
		System.out.println(arr[N][K]);
	}
	
}