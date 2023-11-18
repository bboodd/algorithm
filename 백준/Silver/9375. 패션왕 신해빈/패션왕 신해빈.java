import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	//패션왕 신해빈
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++) {
			Map<String, Integer> map = new HashMap<>();
			int n = Integer.parseInt(br.readLine());
			
			for(int j=0;j<n;j++) {
				String category = br.readLine().split(" ")[1];
				int count = map.getOrDefault(category, 1);
				map.put(category, count+1);
			}
			
			int cnt = 1;
			
			for(String key : map.keySet()) {
				cnt *= map.get(key);
			}
			
			System.out.println(cnt-1);
		}
	}

}
