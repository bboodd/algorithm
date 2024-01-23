import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //게임을 만든 동준이
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int answer = 0;

        int[] game = new int[n];

        for(int i=0;i<game.length;i++){
            game[i] = Integer.parseInt(br.readLine());
        }

        for(int i=game.length-2;i>=0;i--){
            if(game[i] >= game[i+1]){
                int temp = game[i] - game[i+1] + 1;
                answer+=temp;
                game[i] = game[i] - temp;
            }
        }

        System.out.println(answer);
    }
}