import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    //스택
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());

            if(num == 1) stack.push(Integer.parseInt(st.nextToken()));

            if(num == 2){
                if(!stack.isEmpty()){
                    sb.append(stack.pop()).append("\n");
                } else{
                    sb.append(-1).append("\n");
                }
            }

            if(num == 3){
                sb.append(stack.size()).append("\n");
            }

            if(num == 4){
                if(stack.isEmpty()){
                    sb.append(1).append("\n");
                } else{
                    sb.append(0).append("\n");
                }
            }

            if(num == 5){
                if(!stack.isEmpty()){
                    sb.append(stack.peek()).append("\n");
                } else{
                    sb.append(-1).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
