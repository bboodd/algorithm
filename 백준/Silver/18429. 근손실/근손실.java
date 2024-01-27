import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //근손실
    
    static int n,k;
    static int[] arr;
    static boolean[] visited;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        visited = new boolean[n];
        answer = 0;
        back(500, 0);
        System.out.println(answer);

    }
    
    static void back(int sum, int idx){
        if(idx == n){
            answer++;
            return;
        }
        
        for(int i=0;i<n;i++){
            if(!visited[i] && (sum + arr[i] - k) >= 500){
                visited[i] = true;
                back(sum +arr[i] - k, idx + 1);
                visited[i] = false;
            }
        }
    }
}
