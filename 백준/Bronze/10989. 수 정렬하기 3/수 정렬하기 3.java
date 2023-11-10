import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	//수 정렬하기
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		int[] cnt = new int[10001];
		
		for(int i=0;i<N;i++) {
			cnt[Integer.parseInt(br.readLine())]++;
		}
		
		br.close();
		
		
		for(int i = 1;i<10001;i++) {
			while(cnt[i]>0) {
				sb.append(i).append("\n");
				cnt[i]--;
			}
		}
		System.out.println(sb);
	}

}