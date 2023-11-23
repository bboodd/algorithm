import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int count;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		Long a = Long.parseLong(str[0]);
		Long b = Long.parseLong(str[1]);
		
		System.out.println(func(a,b));
		
	}
	
	private static Long func(Long a, Long b) {
		return (a+b) * (a-b);
	}
}