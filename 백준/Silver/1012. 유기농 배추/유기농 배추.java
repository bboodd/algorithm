import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	//유기농 배추
	
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1,0,0,1};
	static int[] dy = {0,-1,1,0};
	static int row;
	static int col;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			row = Integer.parseInt(st.nextToken());
			col = Integer.parseInt(st.nextToken());
			int baechu = Integer.parseInt(st.nextToken());
			int bug = 0;
			
			arr = new int[row][col];
			visited = new boolean[row][col];
			
			for(int i=0;i<baechu;i++) {
				st = new StringTokenizer(br.readLine());
				arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
			}
			
			
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					
					if(arr[i][j] == 1 && !visited[i][j]) {
						dfs(i,j);
						bug++;
					}
				}
			}
			
			System.out.println(bug);
		}
	}
	
	private static void dfs(int x, int y) {
		visited[x][y] = true;
		
		for(int i=0;i<4;i++) {
			
			int nRow = x + dx[i];
			int nCol = y + dy[i];
			
			if(nRow < 0 || nRow >= row || nCol < 0 || nCol >= col) {
				continue;
			}
			
			if(arr[nRow][nCol] == 1 && !visited[nRow][nCol]) {
				dfs(nRow,nCol);
			}
		}
	}

}