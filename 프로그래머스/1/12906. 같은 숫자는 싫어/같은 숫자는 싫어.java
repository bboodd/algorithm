import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            queue.add(arr[i]);
        }
        
        List<Integer> result = new ArrayList<>();
        int temp1 = queue.poll();
        result.add(temp1);
        for(int i=1;i<arr.length;i++){
            int temp2 = queue.poll();
            if(temp1 == temp2){
                continue;
            } else{
                result.add(temp2);
                temp1 = temp2;
            }
            
        }
        
        answer = result.stream().mapToInt(x->x).toArray();
        
        return answer;
    }
}