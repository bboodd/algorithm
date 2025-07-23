import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String temp = s;
        
        for (int i=0;i<s.length();i++) {
            
            Stack<Character> stack = new Stack<>();
            
            for (int j=0;j<s.length();j++) {
                char c = temp.charAt(j);
                
                if (stack.isEmpty()) {
                    stack.push(c);
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            
            if (stack.isEmpty()) {
                answer++;
            }
            
            char first = temp.charAt(0);
            temp = temp.substring(1, s.length()) + first;
        }
        
        return answer;
    }
}