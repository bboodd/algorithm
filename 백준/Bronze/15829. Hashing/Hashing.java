import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	//Hashing
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int L = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		System.out.println(hashing(str));
		
	}
	
	public static int hashing(String str) {
		String[] arr = str.split("");
		int result = 0;
		for(int i=0;i<str.length();i++) {
			result += (str.charAt(i) - 96) * Math.pow(31, i);
		}
		return result;
	}

}