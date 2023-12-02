import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	//쇠막대기
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int count = 0;
		
		int steel = 0;
		
		for(int i=0;i<str.length()-1;i++) {
			char c = str.charAt(i);
			
			if(c == '(') {
				if(str.charAt(i+1) == '(') {
					steel ++;
				}
				if(str.charAt(i+1) == ')') {
					count+=steel;
				}
			}
			
			if(c == ')') {
				if(str.charAt(i+1) == ')') {
					steel--;
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}