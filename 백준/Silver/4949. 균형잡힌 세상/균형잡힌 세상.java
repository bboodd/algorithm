import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	//균형잡힌 세상
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		while(true) {
			String str = br.readLine();
			
			if(str.equals(".")) {
				break;
			}
			
			str = str.replaceAll("[a-zA-Z]", "");
			str = str.replaceAll(" ", "");
			sb.append(balance(str)).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static String balance(String str) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char x = str.charAt(i);
			
			if(x == '(' || x == '[') {
				stack.push(x);
			} 
			else if(x == ')') {
				if(stack.empty() || stack.peek() != '(') {
					return "no";
				} else {
					stack.pop();
				}
			}
			else if(x == ']') {
				if(stack.empty() || stack.peek() != '[') {
					return "no";
				} else {
					stack.pop();
				}
			}
		}
		
		if(stack.empty()) {
			return "yes";
		} else {
			return "no";
		}
	}
}