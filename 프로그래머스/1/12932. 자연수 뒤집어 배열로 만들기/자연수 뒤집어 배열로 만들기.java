class Solution {
    public int[] solution(long n) {
        
        String[] arr = String.valueOf(n).split("");
        
        int[] answer = new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            answer[i] = Integer.parseInt(arr[arr.length-1-i]);
        }
        
        return answer;
    }
}