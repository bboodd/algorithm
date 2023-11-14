import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String answer = "";
		for(int i = 0;i<word.length();i++) {
			char c = word.charAt(i);
			if(Character.isUpperCase(c)) {
				answer += Character.toLowerCase(c);
			} else {
				answer += Character.toUpperCase(c);
			}
		}
		
		System.out.println(answer);
	}
}
