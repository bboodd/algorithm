import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //촌수 계산

    static int[][] arr;
    static boolean[] visited;
    static int res = -1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new int[n+1][n+1];
        visited = new boolean[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int l = Integer.parseInt(br.readLine());

        for(int i=0;i<l;i++){
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            arr[p][c] = arr[c][p] = 1;
        }

        dfs(x,y,0);
        System.out.println(res);

    }

    static void dfs(int start, int end, int cnt){
        if(start == end){
            res = cnt;
            return;
        }

        visited[start] = true;
        for(int i=1;i<arr[start].length;i++){
            if(!visited[i] && arr[start][i] == 1){
                dfs(i,end,cnt+1);
            }
        }
    }
}
