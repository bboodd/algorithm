import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    //연구소

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int[][] origin;
    static int maxSafe = Integer.MIN_VALUE;
    static int N,M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        origin = new int[N][M];

        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++) {
                origin[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0);

        System.out.println(maxSafe);


    }

    static void dfs(int wall){
        if(wall == 3){
            bfs();
            return;
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(origin[i][j] == 0){
                    origin[i][j] = 1;
                    dfs(wall+1);
                    origin[i][j] = 0;
                }
            }
        }
    }

    static void bfs(){
        Queue<Node> q = new LinkedList<>();

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(origin[i][j] == 2){
                    q.add(new Node(i,j));
                }
            }
        }

        int[][] copy = new int[N][M];

        for(int i=0;i<N;i++){
            copy[i] = origin[i].clone();
        }

        while(!q.isEmpty()){
            Node now = q.poll();
            int x = now.x;
            int y = now.y;

            for(int i=0;i<4;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx>=0 && nx<N && ny>=0 && ny<M){
                    if(copy[nx][ny] == 0){
                        q.add(new Node(nx,ny));
                        copy[nx][ny] = 2;
                    }
                }
            }

        }
        countSafe(copy);
    }

    static void countSafe(int[][] copy){
        int safeZone = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(copy[i][j] == 0){
                    safeZone++;
                }
            }
        }

        if(maxSafe < safeZone){
            maxSafe = safeZone;
        }
    }

    static class Node{
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
}
