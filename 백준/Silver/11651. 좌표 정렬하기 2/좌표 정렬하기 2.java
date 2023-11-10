import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	//좌표 정렬하기 2
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, List<Integer>> map = new TreeMap<>();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			List<Integer> list = map.getOrDefault(Y, new ArrayList<>());
			list.add(X);
			map.put(Y, list);
		}
		
		StringBuffer sb = new StringBuffer();
		
		for(int key : map.keySet()) {
			List<Integer> list = map.get(key);
			Collections.sort(list);
			for(int x : list) {
				sb.append(x).append(" ").append(key).append("\n");
			}
		}
		System.out.println(sb);
	}

}