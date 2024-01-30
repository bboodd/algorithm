import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    //최대힙
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<n;i++) {
            int input = Integer.parseInt(br.readLine());

            if(input == 0){
                if(maxHeap.isEmpty()){
                    sb.append(0);
                } else{
                    sb.append(maxHeap.poll());
                }
                sb.append("\n");
            } else{
                maxHeap.add(input);
            }
        }

        System.out.println(sb);

    }
}
