import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    //최소힙
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0;i<n;i++) {
            int input = Integer.parseInt(br.readLine());

            if(input == 0){
                if(minHeap.isEmpty()){
                    sb.append(0);
                } else{
                    sb.append(minHeap.poll());
                }
                sb.append("\n");
            } else{
                minHeap.add(input);
            }
        }

        System.out.println(sb);

    }
}
