class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown + yellow;
        int max = brown/2;
        
        for(int i=3;i<=max;i++){
            for(int j=i;j<=max;j++){
                if(j*i == sum && (j*2)+((i-2)*2) == brown){
                    //넓이가 두 색의 합과 같고 둘레가 갈색의 합과 같다면
                    answer[0] = j;
                    answer[1] = i;
                    break;
                }
            }
        }
        return answer;
    }
}