import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        int len = works.length;
        
        Arrays.sort(works);
        while (n>0) {
            int targetIdx = 0;
            for (int i=len-1;i>0;i--) {
                if (works[i] > works[i-1]) {
                    targetIdx = i;
                    break;
                }
            }
            
            if (works[targetIdx] != 0) {
                works[targetIdx] -= 1;
            }
            
            n -= 1;
        }
        
        for (int i=0;i<len;i++) {
            answer += (long) Math.pow(works[i],2);
        }
        
        return answer;
    }
}