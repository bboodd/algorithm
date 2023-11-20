import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	//프린터 큐
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			LinkedList<int[]> que = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<N;j++) {
				int num = Integer.parseInt(st.nextToken());
				que.offer(new int[] {j, num});
			}
			
			int count = 0;
			
			while(!que.isEmpty()) {
				
				int[] front = que.poll();
				boolean isMax = true;
				
				for(int k=0;k<que.size();k++) {
					
					if(front[1] < que.get(k)[1]) {
						
						que.offer(front);
						
						for(int l=0;l<k;l++) {
							que.offer(que.poll());
						}
						
						isMax = false;
						break;
					}
				}
				
				if(isMax == false) {
					continue;
				}
				
				count++;
				if(front[0] == M) {
					break;
				}
				
				
			}
			sb.append(count).append('\n');
		}
		System.out.println(sb);
	}

}