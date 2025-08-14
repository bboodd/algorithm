class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String base = Integer.toString(n, k);
        String[] arr = base.split("0");
        
        for(String s : arr) {
            if(s.equals("")) {
                continue;
            }
            
            long num = Long.parseLong(s);
            
            if(isPrime(num)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public boolean isPrime(long n) {
        if(n < 2) return false;
        
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}