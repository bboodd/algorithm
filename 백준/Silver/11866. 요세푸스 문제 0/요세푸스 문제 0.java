import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	//요세푸스 문제 0
	static Queue<Integer> queue = new LinkedList<>();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		josephus(N,K);
		
		StringBuffer bf = new StringBuffer();
		bf.append("<");
		for(int i=0;i<N;i++) {
			bf.append(queue.poll() + ", ");
		}
		
		System.out.println(bf.substring(0, bf.length()-2) + ">");
	}
	
	private static void josephus(int N, int K) {
		int cnt = 0;
		List<Integer> li = new ArrayList<>();
		for(int i=1;i<=N;i++) {
			li.add(i);
		}
		while(queue.size() < N) {
			Iterator<Integer> iterator = li.iterator();
			while(iterator.hasNext()) {
				int num = iterator.next();
				if(!queue.contains(num)) {
					cnt++;
				}
				if(cnt == K) {
					queue.add(num);
					cnt = 0;
					iterator.remove();
				}
			}
		}
	}
}