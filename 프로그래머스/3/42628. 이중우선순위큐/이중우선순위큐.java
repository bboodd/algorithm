import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        Queue<Integer> maxQueue = new PriorityQueue<>((i1, i2) -> i2 - i1);
        Queue<Integer> minQueue = new PriorityQueue<>();
        
        for (String s : operations) {
            String[] strs = s.split(" ");
            String command = strs[0];
            int data = Integer.parseInt(strs[1]);
            
            if (command.equals("I")) {
                maxQueue.add(data);
                minQueue.add(data);
            } else {
                if (data == 1) {
                    minQueue.remove(maxQueue.poll());
                } else {
                    maxQueue.remove(minQueue.poll());
                }
            }
        }
        
        int max = maxQueue.isEmpty() ? 0 : maxQueue.poll();
        int min = minQueue.isEmpty() ? 0 : minQueue.poll();
        
        answer[0] = max;
        answer[1] = min;
        
        return answer;
    }
}