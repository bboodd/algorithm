import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] arr = String.valueOf(n).split("");
        int[] arr2 = new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            arr2[i] = Integer.parseInt(arr[i]);
        }
        
        Arrays.sort(arr2);
        
        StringBuilder sb = new StringBuilder();
        for(int i=arr2.length-1;i>=0;i--){
            sb.append(String.valueOf(arr2[i]));
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}