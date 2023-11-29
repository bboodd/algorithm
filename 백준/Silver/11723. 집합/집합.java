import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Cal{
	private static int bit=0;
	
	public static void add(int x) {
		bit |= (1<<x);
	}
	
	public static void remove (int x) {
		bit &= ~(1<<x);
	}
	
	public static int check (int x) {
		if((bit & (1<<x)) == (1<<x)) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static void toggle(int x) {
		bit ^=(1<<x);
	}
	
	public static void all() {
		bit = (1<<21)-1;
	}
	
	public static void empty() {
		bit = 0;
	}
}

public class Main {
	//집합
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int M = Integer.parseInt(br.readLine());
		
		for(int i=0;i<M;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
			case "add" :
				Cal.add(Integer.parseInt(st.nextToken()));
				break;
			case "remove" :
				Cal.remove(Integer.parseInt(st.nextToken()));
				break;
			case "check" :
				sb.append(Cal.check(Integer.parseInt(st.nextToken()))).append("\n");
				break;
			case "toggle" :
				Cal.toggle(Integer.parseInt(st.nextToken()));
				break;
			case "all" :
				Cal.all();
				break;
			case "empty" :
				Cal.empty();
				break;
			}
		}
		
		System.out.println(sb);
	}
	
}