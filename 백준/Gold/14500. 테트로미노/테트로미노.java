import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	//테트로미노
	
	static int N,M;
	static int[][] arr;
	static int max = Integer.MIN_VALUE;
	static boolean[][] visited;
	
	static int dx[] = {-1,0,0,1};
	static int dy[] = {0,-1,1,0};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				visited[i][j] = true;
				dfs(i,j,arr[i][j],1);
				visited[i][j] = false;
			}
		}
		
		System.out.println(max);
		
	}
	
	private static void dfs(int n, int m, int sum, int count) {
		if(count == 4) {
			max = Math.max(max, sum);
			return;
		}
		
		for(int i=0;i<4;i++) {
			int new_y = n+dy[i];
			int new_x = m+dx[i];
			
			if(new_x >= M || new_x < 0 || new_y >= N || new_y < 0) {
				continue;
			}
			
			if(!visited[new_y][new_x]) {
				
				if(count == 2) {
					visited[new_y][new_x] = true;
					dfs(n, m, sum+arr[new_y][new_x], count+1);
					visited[new_y][new_x] = false;
				}
				
				visited[new_y][new_x] = true;
				dfs(new_y, new_x, sum+arr[new_y][new_x], count+1);
				visited[new_y][new_x] = false;
			}
		}
		
	}

}