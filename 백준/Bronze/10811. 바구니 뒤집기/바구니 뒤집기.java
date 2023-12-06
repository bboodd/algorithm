import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = i+1;
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int reverse = m-n+1;
			
			int[] temp = new int[reverse];
			
			int count=m-1;
			
			for(int j=0;j<reverse;j++) {
				temp[j] = arr[count];
				count--;
			}
			
			int count2=0;
			for(int j=n-1;j<=m-1;j++) {
				arr[j] = temp[count2];
				count2++;
			}
			
		}
		
		for(int n:arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}