import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //섬의 개수

    static int[] dw = {-1, 0, 0, 1};
    static int[] dh = {0, -1, 1, 0};
    static boolean[][] visited;
    static int[][] arr;
    static int W,H;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());

            if(W == 0 && H == 0) break;

            arr = new int[H][W];
            visited = new boolean[H][W];

            for(int i=0; i<H; i++){
                st = new StringTokenizer(br.readLine());

                for(int j=0;j<W;j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int count = 0;

            for(int i=0;i<H;i++){

                for(int j=0;j<W;j++){

                    if(arr[i][j] == 1 && !visited[i][j]){
                        dfs(j,i);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    static void dfs(int w, int h){
        visited[h][w] = true;

        for(int i=0;i<4;i++){
            int newW = w + dw[i];
            int newH = h + dh[i];

            if(newW >= W || newW < 0 || newH >= H || newH < 0) continue;

            if(arr[newH][newW] == 1 && !visited[newH][newW]){
                dfs(newW, newH);
            }
        }

        //대각선
        int[] nh = {-1, -1, 1, 1};
        int[] nw = {1, -1, 1, -1};

        for(int i=0;i<4;i++){
            int newW = w + nw[i];
            int newH = h + nh[i];

            if(newW >= W || newW <0 || newH >= H || newH < 0) continue;

            if(arr[newH][newW] == 1 && !visited[newH][newW]){
                dfs(newW, newH);
            }
        }
    }
}
