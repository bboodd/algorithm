import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			String str = br.readLine();
			sb.append(str.charAt(0)).append(str.charAt(str.length()-1)).append("\n");
		}
		System.out.println(sb);
			
			
	}
}