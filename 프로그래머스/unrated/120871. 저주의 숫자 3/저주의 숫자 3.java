class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        for(int i=0;i<n;i++){
            num++;
            while(true){
                if( check1(num) && check2(num)){
                    break;
                } else{
                    num++;
                }
            }
        }
        return num;
    }
    
    public static boolean check1(int num){
        if(num % 3 == 0){
            return false;
        }
        return true;
    }
    
    public static boolean check2(int num){
        for(String n : Integer.toString(num).split("")){
            if(n.equals("3")){
                return false;
            }
        }
        return true;
    }
}