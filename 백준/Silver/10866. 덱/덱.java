import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	//덱
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> deque = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			String commend;
			int x = 0;
			String[] str = br.readLine().split(" ");
			
			if(str.length > 1) {
				commend = str[0];
				x = Integer.parseInt(str[1]);
			} else commend = str[0];
			
			switch(commend) {
			case "push_front":
				deque.addFirst(x);
				break;
			case "push_back":
				deque.addLast(x);
				break;
			case "pop_front":
				if(deque.isEmpty()) System.out.println(-1);
				else System.out.println(deque.pollFirst());
				break;
			case "pop_back":
				if(deque.isEmpty()) System.out.println(-1);
				else System.out.println(deque.pollLast());
				break;
			case "size":
				System.out.println(deque.size());
				break;
			case "empty":
				if(deque.isEmpty()) System.out.println(1);
				else System.out.println(0);
				break;
			case "front":
				if(deque.isEmpty()) System.out.println(-1);
				else System.out.println(deque.getFirst());
				break;
			case "back":
				if(deque.isEmpty()) System.out.println(-1);
				else System.out.println(deque.getLast());
				break;
			}
		}
	}

}