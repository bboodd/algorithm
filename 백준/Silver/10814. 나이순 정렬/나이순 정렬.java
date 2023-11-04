import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	//나이순 정렬
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		Map<Integer, List<String>> map = new TreeMap<>();
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int key = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			List<String> temp = map.getOrDefault(key, new ArrayList<String>());
			temp.add(name);
			map.put(key, temp);
		}
		
		for(int key : map.keySet()) {
			for(String name : map.get(key)) {
				System.out.println(key + " " + name);
			}
		}
	}

}