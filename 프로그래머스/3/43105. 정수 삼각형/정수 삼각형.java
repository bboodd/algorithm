import java.lang.Math;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        for(int i=1;i<triangle.length;i++){
            for(int j=0;j<triangle[i].length;j++){
                if(j==0){
                    triangle[i][j] += triangle[i-1][j];
                    continue;
                }
                if(j==triangle[i].length-1){
                    triangle[i][j] += triangle[i-1][j-1];
                    continue;
                }
                triangle[i][j] += Math.max(triangle[i-1][j-1],triangle[i-1][j]);
            }
        }
        for(int max : triangle[triangle.length-1]){
            answer = Math.max(answer, max);
        }
        return answer;
    }
}