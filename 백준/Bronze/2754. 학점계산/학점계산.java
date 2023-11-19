import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		double score = 0.0;
		
		if(str.equals("F")) {
			System.out.println(score);
			return;
		}
		
		switch(str.charAt(0)) {
		case 'A':
			score += 4.0;
			break;
		case 'B':
			score += 3.0;
			break;
		case 'C':
			score += 2.0;
			break;
		case 'D':
			score += 1.0;
			break;
		}
		
		if(str.charAt(1) == '+') {
			score += 0.3;
		} else if(str.charAt(1) == '-') {
			score -= 0.3;
		}
		
		System.out.println(score);
			
			
	}
}