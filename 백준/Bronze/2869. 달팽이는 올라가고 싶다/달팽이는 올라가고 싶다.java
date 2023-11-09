import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	//달팽이는 올라가고싶다
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		//하루에 올라가는 양
		int up = A-B;
		
		//다음날 꼭대기까지 올라갈 수 있는 양
		int lastDayCount = V - A;
		
		//올라가는 날짜 수
		int day = 0;
		
		if(lastDayCount < up) {
			day = 1;
		} else if(lastDayCount % up == 0){
			day = lastDayCount / up;
		} else {
			day = lastDayCount / up + 1;
		}
		
		//꼭대기까지 올라가기 전날에서 끝나기 때문에 + 1
		int result;
		
		if(V == A) {
			result = day;
		} else {
			result = day + 1;
		}
		
		System.out.println(result);
	}

}