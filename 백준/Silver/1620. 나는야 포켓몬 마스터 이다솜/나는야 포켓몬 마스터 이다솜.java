import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	//나는야 포켓몬 마스터 이다솜

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<Integer, String> mapNum = new HashMap<>();
		Map<String, Integer> mapStr = new HashMap<>();
		
		for(int i=1;i<=N;i++) {
			String poketmon = br.readLine();
			mapNum.put(i, poketmon);
			mapStr.put(poketmon, i);
		}
		
		for(int i=0;i<M;i++) {
			String str = br.readLine();
			if(isInteger(str)) {
				Integer num = Integer.parseInt(str);
				System.out.println(mapNum.get(num));
			} else {
				System.out.println(mapStr.get(str));
			}
		}
	}
	
	private static boolean isInteger(String br) {
		try {
			Integer.parseInt(br);
			return true;
		} catch(NumberFormatException e){
			return false;
		}
	}
}