import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	//단어 정렬
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<Integer, Set<String>> map = new TreeMap<>();
		for(int i=0;i<N;i++) {
			String word = br.readLine();
			int wordLen = word.length();
			Set<String> readSet = map.getOrDefault(wordLen, new HashSet<>());
			readSet.add(word);
			map.put(wordLen, readSet);
		}
		
		for(int key : map.keySet()) {
			List<String> li = new ArrayList<>(map.get(key));
			Collections.sort(li);
			for(String val : li) {
				System.out.println(val);
			}
			
		}
	}

}