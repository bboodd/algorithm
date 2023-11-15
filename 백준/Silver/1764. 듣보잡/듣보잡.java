import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	//듣보잡
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		List<String> answer = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<N;i++) {
			String name = br.readLine();
			map.put(name, 1);
		}
		
		for(int i=0;i<M;i++) {
			String name = br.readLine();
			int val = map.getOrDefault(name, 0);
			if(val != 0) {
				answer.add(name);
			}
		}
		
		Collections.sort(answer);
		
		sb.append(answer.size()).append("\n");
		for(String name : answer) {
			sb.append(name).append("\n");
		}
		
		System.out.println(sb);
	}

}