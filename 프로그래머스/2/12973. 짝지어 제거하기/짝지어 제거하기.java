import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        
        char[] charArr = s.toCharArray();
        
        for(char c : charArr){
            if(stack.isEmpty()){
                stack.push(c);
                continue;
            } else{
                if(stack.peek() == c){
                    stack.pop();
                } else{
                    stack.push(c);
                }
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}