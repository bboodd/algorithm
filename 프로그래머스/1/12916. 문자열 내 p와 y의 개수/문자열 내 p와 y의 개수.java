class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int count_p = 0;
        int count_y = 0;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == 'p' || c == 'P') count_p++;
            if(c == 'y' || c == 'Y') count_y++;
        }
        
        if(count_p!=count_y) answer = false;

        return answer;
    }
}