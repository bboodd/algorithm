import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	//solved.ac
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		int fifteenPer = (int)Math.round(15*n / 100.0);
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		int sum = 0;
		
		for(int i=fifteenPer;i<arr.length-fifteenPer;i++) {
			sum += arr[i];
		}
		
		int result = (int)Math.round(sum / (double)(arr.length - (fifteenPer * 2)));
		
		System.out.println(result);
	}

}