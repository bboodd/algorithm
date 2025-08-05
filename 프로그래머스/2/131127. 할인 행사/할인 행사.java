import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        List<String> wantList = new ArrayList<>(Arrays.asList(want));
        
        for (int i=0; i<=discount.length-10; i++) {
            int[] cnt = new int[number.length];
            
            for (int j=i; j<i+10; j++) {
                if (!wantList.contains(discount[j])) {
                    continue;
                }
                
                for (int k=0; k<want.length; k++) {
                    if (discount[j].equals(want[k])) {
                        cnt[k]++;
                    }
                }
            }
            
            if (Arrays.equals(cnt, number)) {
                answer++;
            }
        }
        
        return answer;
    }
}