import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	//스택
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			String commend;
			int x = 0;
			String[] str = br.readLine().split(" ");
			
			if(str.length > 1) {
				commend = str[0];
				x = Integer.parseInt(str[1]);
			} else {
				commend = str[0];
			}
			
			switch(commend){
			case "push":
				stack.add(x);
				break;
			case "pop":
				if(stack.isEmpty()) System.out.println(-1);
				else System.out.println(stack.pop());
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				if(stack.isEmpty()) System.out.println(1);
				else System.out.println(0);
				break;
			case "top":
				if(stack.isEmpty()) System.out.println(-1);
				else System.out.println(stack.peek());
				break;
			}
		}
	}

}