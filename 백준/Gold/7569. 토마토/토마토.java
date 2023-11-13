import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
	int x,y,z;
	public Point(int z, int y, int x) {
		this.z = z;
		this.y = y;
		this.x = x;
	}
}

public class Main {
	//토마토
	static int[] dx = {-1, 0, 0, 1, 0, 0};
	static int[] dy = {0, 1, -1, 0, 0, 0};
	static int[] dz = {0, 0, 0, 0, -1, 1};
	static int[][][] arr;
	static int M;
	static int N;
	static int H;
	static Queue<Point> queue = new LinkedList<>();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		arr = new int[H+1][N+1][M+1];
		for(int i=1;i<=H;i++) {
			for(int j=1;j<=N;j++) {
				st = new StringTokenizer(br.readLine());
				for(int k=1;k<=M;k++) {
					arr[i][j][k] = Integer.parseInt(st.nextToken());
					if(arr[i][j][k] == 1) queue.add(new Point(i,j,k));
					
				}
			}
		}
		System.out.println(bfs());

	}
	
	private static int bfs() {
		while(!queue.isEmpty()) {
			Point point = queue.poll();
			int z = point.z;
			int y = point.y;
			int x = point.x;
			
			for(int i=0;i<6;i++) {
				int newY = y+dy[i];
				int newX = x+dx[i];
				int newZ = z+dz[i];
				if(checkXYZ(newZ, newY, newX)) {
					queue.add(new Point(newZ, newY, newX));
					arr[newZ][newY][newX] = arr[z][y][x] + 1;
				}
			}
		}
		
		int result = Integer.MIN_VALUE;
		
		for(int i=1;i<=H;i++) {
			for(int j=1;j<=N;j++) {
				for(int k=1;k<=M;k++) {
					if(arr[i][j][k] == 0) {
						return -1;
					}
					result = Math.max(result, arr[i][j][k]);
				}
			}
		}
		
		if(result == 1) {
			return 0;
		}
		else return result-1;
		
	}
	
	private static boolean checkXYZ(int z, int y, int x) {
		if(x < 1 || x > M || y < 1 || y > N || z < 1 || z > H) {
			return false;
		}
		if(arr[z][y][x] == 0) {
			return true;
		}
		else return false;
		
	}
}