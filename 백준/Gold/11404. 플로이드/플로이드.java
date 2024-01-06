import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        int[][] dist = new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            Arrays.fill(dist[i], Integer.MAX_VALUE);
            dist[i][i] = 0;
        }

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(dist[a][b] > c){
                dist[a][b] = c;
            }
        }

        // i : 중간점 j : 시작점 k : 끝점
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(dist[j][i] == Integer.MAX_VALUE) continue;

                for(int k=1;k<=n;k++){
                    if(dist[i][k] == Integer.MAX_VALUE) continue;

                    if(dist[j][k] > dist[j][i] + dist[i][k]){
                        dist[j][k] = dist[j][i] + dist[i][k];
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (dist[i][j] == Integer.MAX_VALUE) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
