import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	//적록색약
	
	static int[] dx = {-1, 0, 0, 1};
	static int[] dy = {0, 1, -1, 0};
	static int N;
	static char[][] arr;
	static String S;
	static boolean[][] visited;
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		visited = new boolean[N+1][N+1];
		arr = new char[N+1][N+1];
		
		for(int i=0;i<N;i++) {
			S = br.readLine(); // RRRBB
			for(int j=0;j<N;j++) {
				arr[i][j] = S.charAt(j); // R R R B B
			}
		}
		// 정상인 경우
		int cnt=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!visited[i][j]) {
					dfs(i,j);
					cnt++;
				}
			}
		}
		int normal_cnt=cnt;
		cnt=0;
		visited = new boolean[N+1][N+1];
		
		// 비정상인 경우
        // G를 R로 바꿔주고 돌린다.
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(arr[i][j]=='G') {
					arr[i][j] = 'R';
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!visited[i][j]) {
					dfs(i,j);
					cnt++;
				}
			}
		}
		
		int abnormal_cnt = cnt;
		System.out.println(normal_cnt + " " + abnormal_cnt);
	}
	
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		char temp_char = arr[x][y];
		
		for(int i=0;i<4;i++) {
			int new_x = dx[i] + x;
			int new_y = dy[i] + y;
			
			if(new_x < 0 || new_y < 0 || new_x > N || new_y > N) {
				continue;
			}
			if(!visited[new_x][new_y] && arr[new_x][new_y] == temp_char) {
				dfs(new_x,new_y);
			}
		}
	}

}
