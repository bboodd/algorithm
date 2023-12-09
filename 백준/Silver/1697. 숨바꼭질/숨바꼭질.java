import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    //숨바꼭질
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if(N == K){
            System.out.println(0);
            return;
        }

        boolean[] visited = new boolean[100001];

        Queue<Integer> queue = new LinkedList<>();

        visited[N] = true;
        queue.add(N);

        int cnt = 0;

        int size = queue.size();

        while(true){
            cnt++;
            size = queue.size();

            for(int i = 0; i < size; i++){

                int now = queue.remove();
                visited[now] = true;

                if(now-1 == K || now+1 == K || now*2 == K){
                    System.out.println(cnt);
                    return;
                }

                if(now-1 > 0 && !visited[now-1]){
                    visited[now-1] = true;
                    queue.add(now-1);
                }

                if(now+1 < 100001 && !visited[now+1]){
                    visited[now+1] = true;
                    queue.add(now+1);
                }

                if(now*2 < 100001 && !visited[now*2]){
                    visited[now*2] = true;
                    queue.add(now*2);
                }
            }

        }
    }
}