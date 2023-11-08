import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	//큐
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Que que = new Que();
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			String commend;
			int x = 0;
			String[] arr = br.readLine().split(" ");
			if(arr.length > 1) {
				commend = arr[0];
				x = Integer.parseInt(arr[1]);
			} else {
				commend = arr[0];
			}
			if(commend.equals("push")) que.push(x);
			if(commend.equals("pop")) que.pop();
			if(commend.equals("size")) que.size();
			if(commend.equals("empty")) que.empty();
			if(commend.equals("front")) que.front();
			if(commend.equals("back")) que.back();
		}
		
	}
	
	

}

class Que {
	private final List<Integer> list;
	
	public Que() {
		this.list = new ArrayList<>();
	}
	
	public void push(int x) {
		list.add(x);
	}
	
	public void pop() {
		if(list.isEmpty()) {
			System.out.println(-1);
		} else {
		System.out.println(list.get(0));
		list.remove(0);
		}
	}
	
	public void size() {
		System.out.println(list.size());
	}
	
	public void empty() {
		if(list.isEmpty()) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	
	public void front() {
		if(list.isEmpty()) {
			System.out.println(-1);
		} else {
			System.out.println(list.get(0));
		}
	}
	
	public void back() {
		if(list.isEmpty()) {
			System.out.println(-1);
		} else {
			System.out.println(list.get(list.size()-1));
		}
	}
}