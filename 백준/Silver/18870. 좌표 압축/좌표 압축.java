import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        int[] sortArr = new int[n];
        
        for(int i = 0;i<n;i++){
            sortArr[i] = arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sortArr);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 0;
        for(int v : sortArr){
            if(!map.containsKey(v)){
                map.put(v, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : arr){
            sb.append(map.get(key)).append(' ');
        }

        System.out.println(sb);

        
    }
}