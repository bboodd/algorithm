import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	//헌내기는 친구가 필요해
	
	static char[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static int N;
	static int M;
	static int count = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int doyeon_x = 0;
		int doyeon_y = 0;
		
		arr = new char[N][M];
		visited = new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			String line = br.readLine();
			for(int j=0;j<M;j++) {
				arr[i][j] = line.charAt(j);
				if(line.charAt(j) == 'I') {
					doyeon_x = i;
					doyeon_y = j;
				}
			}
		}
		
		dfs(doyeon_x, doyeon_y);
		
		if (count == 0) {
			System.out.println("TT");
		} else {
			System.out.println(count);
		}
		
	}
	
	private static void dfs(int i, int j) {
		visited[i][j] = true;
		
		if(arr[i][j] == 'P') {
			count++;
		}
		
		for(int n=0;n<4;n++) {
			int new_x = i+dx[n];
			int new_y = j+dy[n];
			
			if(new_x < 0 || new_x >= N || new_y < 0 || new_y >= M) {
				continue;
			}
			if(!visited[new_x][new_y] && arr[new_x][new_y] != 'X') {
				dfs(new_x,new_y);
			}
			
		}
	}
}