import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	//BABBA
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		
		int[][] AB = new int[K][2];
		
		AB[0][0] = 0;
		AB[0][1] = 1;
		
		for(int i=1;i<K;i++) {
			AB[i][0] = AB[i-1][1];
			AB[i][1] = AB[i-1][0] + AB[i-1][1];
		}
		
		System.out.println(AB[K-1][0] + " " + AB[K-1][1]);
	}

}