import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int count;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			String str = br.readLine();
			System.out.println(isPalindrome(str)+" "+count);
		}
			
	}
	
	private static int recursion(String str, int i, int j) {
		count++;
		if(i >= j) return 1;
		else if(str.charAt(i) != str.charAt(j)) return 0;
		else return recursion(str, i+1, j-1);
	}
	
	private static int isPalindrome(String str) {
		count = 0;
		return recursion(str, 0, str.length()-1);
	}
}