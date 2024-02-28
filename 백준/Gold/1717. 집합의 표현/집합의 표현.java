import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    //집합의 표현
    public static int[] parent = new int[1000001];
    
    public static int find(int x){
        if(x == parent[x]){
            return x;
        } else{
            return parent[x] = find(parent[x]);
        }
    }
    
    public static void union(int x, int y){
        x = find(x);
        y = find(y);
        
        if(x != y){
            parent[y] = x;
        }
    }
    
    public static boolean isSameParent(int x, int y){
        x = find(x);
        y = find(y);
        if(x == y){
            return true;
        } else{
            return false;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i=0;i<=n;i++){
            parent[i] = i;
        }

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());

            int cal = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(cal == 0){
                union(a,b);
            } else{
                if(isSameParent(a,b)){
                    System.out.println("YES");
                } else{
                    System.out.println("NO");
                }
            }
        }

    }
}
