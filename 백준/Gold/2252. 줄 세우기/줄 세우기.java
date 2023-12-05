import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	//줄 세우기
	static int M;
	static int N;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		int[] cntLink = new int[N+1];
		
		List<List<Integer>> graph = new ArrayList<>();
		for(int i=0;i<N+1;i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			
			graph.get(v1).add(v2);
			cntLink[v2]++;
		}
		
		topologicalSort(graph,cntLink);
	}
	
	static void topologicalSort(List<List<Integer>> graph, int[] cntLink) {
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1;i<N+1;i++) {
			if(cntLink[i] == 0) {
				queue.add(i);
			}
		}
		
		for(int i=0;i<N;i++) {
			int v = queue.poll();
			System.out.print(v + " ");
			
			for(int nextV : graph.get(v)) {
				cntLink[nextV]--;
				
				if(cntLink[nextV] == 0) {
					queue.add(nextV);
				}
			}
		}
	}

}