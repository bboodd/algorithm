
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point{
	int x,y;
	public Point(int y, int x) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	//토마토
	static int[] dx = {-1,0,0,1};
	static int[] dy = {0,1,-1,0};
	static int[][] arr;
	static int M;
	static int N;
	static Queue<Point> que = new LinkedList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		arr = new int[N+1][M+1];
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<=M;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 1) que.add(new Point(i,j));
			}
		}
		System.out.println(bfs());
		
	}
	
	private static int bfs() {
		while(!que.isEmpty()) {
			Point point = que.poll();
			int x = point.x;
			int y = point.y;
			
			for(int i=0;i<4;i++) {
				if(checkLocation(x + dx[i], y + dy[i])) {
					que.add(new Point(y + dy[i], x + dx[i]));
					arr[y + dy[i]][x + dx[i]] = arr[y][x] + 1;
				}
			}
		}
		int result = 1;
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				if(arr[i][j] == 0) {
					return -1;
				}
				result = Math.max(result, arr[i][j]);
			}
		}
		if(result == 1) {
			return 0;
		}
		return result-1;
	}
	
	private static boolean checkLocation(int x, int y) {
		if(x < 1 || x > M || y < 1 || y > N) {
			return false;
		}
		if(arr[y][x] == 0) {
			return true;
		}
		return false;
	}

}
