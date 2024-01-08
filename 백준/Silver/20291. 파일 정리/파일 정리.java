import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    //파일 정리
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            String line = br.readLine();

            StringBuilder str = new StringBuilder();

            for(int j=0; j<line.length(); j++) {
                if(line.charAt(j) == '.'){
                    str.append(line.substring(j+1));
                    break;
                }
            }

            map.put(str.toString(), map.getOrDefault(str.toString(), 0)+1);
        }

        List<String> keySet = new ArrayList<>(map.keySet());

        Collections.sort(keySet);

        for(String key : keySet){
            System.out.print(key + " " + map.get(key));
            System.out.println();
        }
    }
}
