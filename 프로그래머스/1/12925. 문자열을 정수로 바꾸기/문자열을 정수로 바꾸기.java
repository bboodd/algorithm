class Solution {
    public int solution(String s) {
        int answer = 0;
        boolean flag = true;
        
        if(Character.isDigit(s.charAt(0))){
             for(int i=0;i<s.length();i++){
                answer += Character.getNumericValue(s.charAt(i)) * Math.pow(10,s.length()-i-1);
             }
        } else{
            if(s.charAt(0) == '-') flag = false;
            for(int i=1;i<s.length();i++){
                answer += Character.getNumericValue(s.charAt(i)) * Math.pow(10,s.length()-i-1);
            }
        }
        
        if(flag == false) answer *= -1;
        
        return answer;
    }
}