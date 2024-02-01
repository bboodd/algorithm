import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    //후위 표기식
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        StringBuilder sb = new StringBuilder();

        Stack<Character> operator = new Stack<>(); //연산자

        for(int i=0;i<line.length();i++){
            char c = line.charAt(i);

            if(c >= 'A' && c <= 'Z') sb.append(c); //숫자라면 출력
            else if(c == '(') operator.push(c);
            else if(c == ')' && !operator.isEmpty()){ // '('이 나올때 까지
                while(!operator.isEmpty() && operator.peek() != '('){
                    sb.append(operator.pop()); //괄호가 아니면 출력
                }
                if(!operator.isEmpty()) operator.pop(); //'(' 꺼내기
            }
            else{ //+ - * / 인 경우
                while(!operator.isEmpty() && priority(operator.peek()) >= priority(c)){
                    sb.append(operator.pop());
                }
                operator.push(c);
            }
        }
        //모두 꺼내기
        while(!operator.isEmpty()){
            sb.append(operator.pop());
        }

        System.out.println(sb);

    }

    static int priority(char op){
        if(op == '*' || op == '/') return 2; // 우선순위
        else if(op == '+' || op == '-') return 1;
        else return 0; //스택 안에는 '(' 도 들어올 수 있지만 꺼내져서는 안되기 때문에 제일 낮은 우선순위
    }


}
