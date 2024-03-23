import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    static int n;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        visited = new boolean[n][n];
        
        int max = 0;

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                int a = Integer.parseInt(st.nextToken());
                arr[i][j] = a;
                max = Math.max(max,a);
            }
        }

        int answer = 0;

        for(int k=0;k<=max;k++){
            visited = new boolean[n][n];
            int cnt = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(arr[i][j]>k && !visited[i][j]) {
                        dfs(i,j,k);
                        cnt++;
                    }
                }
            }
            answer = Math.max(answer, cnt);
        }

        System.out.println(answer);
    }

    static void dfs(int x, int y, int h){
        visited[x][y] = true;

        for(int i=0;i<4;i++){
            int newX = x + dx[i];
            int newY = y + dy[i];

            if(newX < 0 || newX >=n || newY < 0 || newY >=n) continue;
            
            if(!visited[newX][newY] && arr[newX][newY] > h) dfs(newX, newY, h);
        }
    }
}