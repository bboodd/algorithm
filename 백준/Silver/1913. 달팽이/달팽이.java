import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //달팽이
    
    static int N, A;
    static int[][] arr;
    
    static int[] dx = {1,0,-1,0}; // 아래 -> 오른쪽 -> 위 -> 왼쪽
    static int[] dy = {0,1,0,-1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        A = Integer.parseInt(br.readLine());
        
        arr = new int[N][N];
        
        int index = 0;
        
        int curX = 0;
        int curY = 0;
        
        arr[curX][curY] = N*N;
        
        while(index < 4){
            int nx = curX + dx[index];
            int ny = curY + dy[index];
            
            if(nx >= 0 && ny >= 0 && nx < N && ny < N && arr[nx][ny] == 0){
                arr[nx][ny] = arr[curX][curY] - 1;
                
                if(arr[nx][ny] == 1) break;
                
                curX = nx;
                curY = ny;
            } else{
                index++;
            }
            
            if(index >= 4){
                index = 0;
            }
        }
        
        int findX = 0 , findY = 0;
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(arr[i][j] == A){
                    findX = i+1;
                    findY = j+1;
                }
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        sb.append(findX).append(" ").append(findY);
        
        System.out.println(sb);

    }
}
