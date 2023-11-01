import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	//단지번호붙이기
	static int[] dy = {0,-1,1,0};
	static int[] dx = {-1,0,0,1};
	static List<Integer> answer = new ArrayList<>();
	static int[][] arr;
	static String S;
	static int count, dangi, N;
	static boolean[][] visited;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N+1][N+1];
		visited = new boolean[N+1][N+1];
		for(int i=0;i<N;i++) {
			S = br.readLine();
			for(int j=0;j<N;j++) {
				arr[i][j] = Character.getNumericValue(S.charAt(j));
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!visited[i][j] && arr[i][j] == 1) {
					count = 0;
					dangi++;
					dfs(i,j);
					answer.add(count);
				}
			}
		}
		
		Collections.sort(answer);
		System.out.println(dangi);
		for(int num : answer) {
			System.out.println(num);
		}
	}
	
	private static void dfs(int x, int y) {
		visited[x][y] = true;
		arr[x][y] = dangi;
		count++;
		
		for(int i=0;i<4;i++) {
			int new_x = dx[i] + x;
			int new_y = dy[i] + y;
			
			if(new_x < 0 || new_x > N || new_y < 0 || new_y > N) {
				continue;
			}
			
			if(arr[new_x][new_y] == 1 && !visited[new_x][new_y]) {
				dfs(new_x, new_y);
			}
		}
	}

}