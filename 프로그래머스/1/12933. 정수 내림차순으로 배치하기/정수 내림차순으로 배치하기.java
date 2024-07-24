import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] arr = String.valueOf(n).split("");
        
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder();
        
        for(String s : arr) sb.append(s);
        
        answer = Long.parseLong(sb.reverse().toString());
        
        return answer;
    }
}