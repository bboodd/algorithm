import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	// 정점 개수
	static int n;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int t = Integer.parseInt(br.readLine());

		for (int i=0; i<t; i++) {
			n = Integer.parseInt(br.readLine());

			int[] indegree = new int[n+1];
			List<List<Integer>> array = new ArrayList<>();

			for (int j=0; j<n+1; j++) {
				array.add(new ArrayList<>());
			}

			st = new StringTokenizer(br.readLine());
			int[] rank = new int[n+1];
			for (int j=1; j<n+1; j++) {
				rank[j] = Integer.parseInt(st.nextToken());
			}

			for (int j=1; j<n+1; j++) {
				for (int k=j+1; k<n+1; k++) {
					array.get(rank[j]).add(rank[k]);
					indegree[rank[k]]++;
				}
			}

			int change = Integer.parseInt(br.readLine());
			for (int j=0; j<change; j++) {
				st = new StringTokenizer(br.readLine());
				int num1 = Integer.parseInt(st.nextToken());
				int num2 = Integer.parseInt(st.nextToken());

				if (array.get(num1).contains(num2)) {
					array.get(num1).remove((Integer) num2);
					array.get(num2).add(num1);
					indegree[num2]--;
					indegree[num1]++;
				} else {
					array.get(num2).remove((Integer) num1);
					array.get(num1).add(num2);
					indegree[num1]--;
					indegree[num2]++;
				}
			}

			System.out.println(topologicalSort(indegree, array));
		}
	}

	public static String topologicalSort(int[] indegree, List<List<Integer>> array) throws IOException {
		Queue<Integer> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();

		// queue에 indegree가 0인 노드 담기
		for (int i=1; i<n+1; i++) {
			if (indegree[i] == 0) {
				q.offer(i);
			}
		}

		for (int k=1; k<n+1; k++) {
			if (q.isEmpty()) {
				return "IMPOSSIBLE";
			}
			if (q.size() > 1) {
				return "?";
			}

			int node = q.poll();
			sb.append(node).append(" ");

			for (Integer i : array.get(node)) {
				indegree[i]--;

				if (indegree[i] == 0) {
					q.offer(i);
				}
			}
		}

		return sb.toString();
	}
}
