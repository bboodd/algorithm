import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	//뒤집기
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int zeroCount = 0;
		int oneCount = 0;
		
		char prevChar= s.charAt(0);
		
		for(int i=1;i<s.length();i++) {
			char c = s.charAt(i);
			
			if(c != prevChar) {
				if(prevChar == '0') {
					zeroCount++;
				} else {
					oneCount++;
				}
			}
			
			prevChar = c;
		}
		
		if(prevChar == '0') {
			zeroCount++;
		} else {
			oneCount++;
		}
		
		System.out.println(Math.min(zeroCount, oneCount));
	}

}
