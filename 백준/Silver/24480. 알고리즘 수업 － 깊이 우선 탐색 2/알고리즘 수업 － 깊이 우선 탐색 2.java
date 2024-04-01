import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    static int n,m,r;
    static boolean[] visited;
    static int[] answer;

    static int count = 1;

    static List<List<Integer>> arr2 = new ArrayList<>();
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];
        answer = new int[n+1];

        for(int i=0;i<n+1;i++){
            arr2.add(new ArrayList<>());
        }

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            arr2.get(u).add(v);
            arr2.get(v).add(u);
        }

        visited[r] = true;
        dfs(r);
        
        for(int i=1;i<=n;i++){
            sb.append(answer[i]).append("\n");
        }

        System.out.println(sb);
    }

    static void dfs(int r){
        visited[r] = true;

        answer[r] = count;
        count+=1;
        
        arr2.get(r).sort(Comparator.reverseOrder());
        
        arr2.get(r).forEach((element) ->{
            if(!visited[element]) dfs(element);
            });
    }
}