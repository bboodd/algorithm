import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    //절댓값 힙
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> absHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            // return값이 양수면 순서변경 음수면 변경x
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) < Math.abs(o2)){
                    return -1;
                } else if(Math.abs(o1) == Math.abs(o2)){
                    return o1-o2;
                } else{
                    return Math.abs(o1) - Math.abs(o2);
                }
            }
        });

        for(int i=0;i<n;i++){
            int input = Integer.parseInt(br.readLine());

            if(input == 0){
                if(absHeap.isEmpty()){
                    sb.append(0);
                } else{
                    sb.append(absHeap.poll());
                }
                sb.append("\n");
            } else{
                absHeap.add(input);
            }
        }

        System.out.println(sb);

    }
}
