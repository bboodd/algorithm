class Solution {
    public long solution(long n) {
        long answer = -1;
        
        double log = Math.sqrt(n);
        
        if(log == Math.ceil(log)) answer = (long)Math.pow(log+1,2);
        
        return answer;
    }
}