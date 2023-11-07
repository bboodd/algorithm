import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	//수 찾기
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		Arrays.sort(arr);
		
		for(int i=0;i<M;i++) {
			int X = Integer.parseInt(st.nextToken());
			System.out.println(lowerBound(arr, X));
		}
		
	}
	
	private static int lowerBound(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length;
		while(lo<hi) {
			int mid = (lo + hi) / 2;
			
			if(key<=arr[mid]) {
				hi = mid;
			} else {
				lo = mid +1;
			}
		}
		
		if(lo >= arr.length) {
			return 0;
		} else if(key < arr[lo]) {
			return 0;
		}
		return 1;
	}

}