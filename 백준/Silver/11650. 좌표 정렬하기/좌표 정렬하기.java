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
	//좌표 정렬하기
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		Map<Integer, List<Integer>> map = new TreeMap<>();
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			List<Integer> li = map.getOrDefault(x, new ArrayList<Integer>());
			li.add(y);
			map.put(x, li);
		}
		
		for(int key : map.keySet()) {
			List<Integer> value = map.get(key);
			Collections.sort(value);
			for(int num : value) {
				System.out.println(key + " " + num);
			}
		}
	}

}