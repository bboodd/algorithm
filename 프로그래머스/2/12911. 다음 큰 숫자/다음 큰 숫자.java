class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String originalBinary = Integer.toBinaryString(n);
        String originalReplace = originalBinary.replace("0", "");
        
        int temp = n;
        while (true) {
            temp++;
            String newBinary = Integer.toBinaryString(temp);
            String newReplace = newBinary.replace("0", "");
            
            if (originalReplace.equals(newReplace)) {
                break;
            }
        }
        
        return temp;
    }
}