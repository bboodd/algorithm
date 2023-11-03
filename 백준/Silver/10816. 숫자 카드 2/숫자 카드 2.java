import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Map<Integer, Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int num = Integer.parseInt(st.nextToken());
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
//		String answer = "";
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<M;i++) {
			int m = Integer.parseInt(st.nextToken());
			sb.append(map.getOrDefault(m, 0)).append(' ');
//			answer+= map.getOrDefault(m, 0) + " ";
		}
//		answer = answer.substring(0, answer.length()-1);
		System.out.println(sb);
	}

}