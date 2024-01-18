import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //비밀번호 발음하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String word = br.readLine();

            if(word.equals("end")) break;

            boolean[] mo = new boolean[word.length()];

            int wrong = 0;

            for(int i=0; i<word.length(); i++) {
                if(word.charAt(i) == 'a' || word.charAt(i) == 'e'
                || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                || word.charAt(i) =='u'){
                    mo[i] = true;
                }

                if(i>0){
                    if(word.charAt(i) == word.charAt(i-1)){
                        if(word.charAt(i) == 'e' || word.charAt(i) == 'o'){
                            continue;
                        } else{
                            wrong = 1;
                        }
                    }
                }
            }

            int cnt = 0;
            for(int i=0;i<mo.length;i++){
                if(mo[i]) cnt++;

                if(i>1){
                    if(mo[i] == mo[i-1] && mo[i-1] == mo[i-2]){
                        wrong = 1;
                    }
                }
            }

            if(cnt == 0){
                wrong = 1;
            }

            if(wrong == 1){
                System.out.printf("<%s> is not acceptable.", word);
            } else{
                System.out.printf("<%s> is acceptable.", word);
            }
            System.out.println();
        }
    }
}