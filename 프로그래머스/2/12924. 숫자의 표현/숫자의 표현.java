class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            answer+=func(i,n);
        }
        return answer;
    }
    
    public int func(int m,int n){
        int temp = 0;
        for(int j=m;j<=n;j++){
            temp+=j;
            if(temp == n){
                return 1;
            }
            if(temp>n){
                break;
            }
        }
        return 0;
    }
}