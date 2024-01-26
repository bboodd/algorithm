import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //그림

    static int n;
    static int m;
    static boolean[][] visited;
    static int[][] arr;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        int max = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && arr[i][j] == 1){
                    dfs(i,j);
                    cnt++;
                    max = Math.max(max, size);
                    size = 0;

                }
            }
        }

        System.out.println(cnt);
        System.out.println(max);

    }

    static void dfs(int col, int row){
        visited[col][row] = true;
        size++;

        for(int i=0;i<4;i++){
            int newCol = col+dx[i];
            int newRow = row+dy[i];

            if(newCol < 0 || newCol >= n || newRow < 0 || newRow >=m){
                continue;
            }

            if(!visited[newCol][newRow] && arr[newCol][newRow] != 0){
                dfs(newCol, newRow);
            }
        }
    }
}

