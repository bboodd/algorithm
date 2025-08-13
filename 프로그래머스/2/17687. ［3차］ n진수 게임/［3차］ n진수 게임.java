class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        int number = 0;
        int turn = 1;
        while(answer.length() < t) {
            
            String base = Integer.toString(number, n);
            for(int i=0; i<base.length(); i++) {
                char c = base.charAt(i);
                if(turn == p) {
                    answer += c;
                    if(answer.length() == t) {
                        break;
                    }
                }
                
                turn += 1;
                if(turn > m) {
                    turn -= m;
                }
            }
            
            number += 1;
        }
        
        return answer.toUpperCase();
    }
}