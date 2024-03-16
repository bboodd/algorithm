import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    static int n;
    static int m;
    static String[][] arr;
    static boolean[][] visited;
    static int[] dx = {0,-1,0,1};
    static int[] dy = {-1,0,1,0};
    static int[] answer = new int[2];  

    static int wc = 0;
    static int rc = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new String[n][m];
        visited = new boolean[n][m];

        for(int i=0;i<n;i++){
            String line = br.readLine();
        
            for(int j=0;j<m;j++){
                arr[i][j] = Character.toString(line.charAt(j));
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!arr[i][j].equals("#") && !visited[i][j]){
                    dfs(i,j);
                }
                if(rc > wc) answer[0] += rc;
                if(wc >= rc) answer[1] += wc;
                rc = 0;
                wc = 0;
            }
        }

        System.out.println(answer[0] + " " + answer[1]);

        
    }

    static void dfs(int x, int y){
        visited[x][y] = true;

        if(arr[x][y].equals("v")) wc++;
        if(arr[x][y].equals("o")) rc++;
        
        for(int i=0;i<4;i++){
            int newX = x + dx[i];
            int newY = y + dy[i];
    
            if(newX < 0 || newX >= n || newY < 0 || newY >= m){
                continue;
            }
            if(!visited[newX][newY] && !arr[newX][newY].equals("#")){
                dfs(newX, newY);
            }
        }
    }
}