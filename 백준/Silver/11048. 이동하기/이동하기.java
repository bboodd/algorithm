import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //이동하기
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] dp = new int[n][m];

        int[] dx = {-1,0,-1};
        int[] dy = {0,-1,-1};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int beforeCandy = 0;

                for(int k=0;k<3;k++){
                    int newX = i+dx[k];
                    int newY = j+dy[k];

                    if(newX >= 0 && newY >= 0){
                        beforeCandy = Math.max(beforeCandy, arr[newX][newY]);
                    }
                }

                arr[i][j] += beforeCandy;
            }
        }

        System.out.println(arr[n-1][m-1]);

    }
}
