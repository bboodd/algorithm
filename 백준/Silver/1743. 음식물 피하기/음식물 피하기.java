import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    
    static int n,m,k;
    static String[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int count = 0;
    static int answer = 0;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
    
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new String[n][m];
        visited = new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = ".";
            }
        }
        
        for(int i=0;i<k;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x-1][y-1] = "#";
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j].equals("#") && !visited[i][j]){
                    count = 0;
                    dfs(i,j);
                    answer = Math.max(count, answer);
                }
            }
        }

        System.out.println(answer);

    }

    public static void dfs(int x, int y){
        visited[x][y] = true;
        count++;  
    
        for(int i=0;i<4;i++){
            int newX = x + dx[i];
            int newY = y + dy[i];

            if(newX < 0 || newX >= n || newY < 0 || newY >= m) continue; 
    
            if(arr[newX][newY].equals("#") && !visited[newX][newY]) {
                dfs(newX, newY); 
            }
        }
    }
}