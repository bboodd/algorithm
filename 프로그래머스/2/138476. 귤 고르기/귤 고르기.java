import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }
        
        List<Integer> sizeList = new ArrayList<>(map.keySet());
    
        sizeList.sort((o1, o2) -> map.get(o2) - map.get(o1));
        
        int i = 0;
        while (k > 0) {
            k -= map.get(sizeList.get(i));
            answer++;
            i++;
        }
        
        return answer;
    }
}