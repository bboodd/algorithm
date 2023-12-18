import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //생일
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] name = new String[n];
        int[] day = new int[n];
        int[] month = new int[n];
        int[] year = new int[n];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            name[i] = st.nextToken();
            day[i] = Integer.parseInt(st.nextToken());
            month[i] = Integer.parseInt(st.nextToken());
            year[i] = Integer.parseInt(st.nextToken());
        }

        int old = 0;
        int young = 0;

        for(int i = 1; i < n; i++){

            if(year[i] < year[old]){
                old = i;
            } else if (year[i] == year[old]){
                if(month[i] < month[old]){
                    old = i;
                } else if (month[i] == month[old]){
                    if(day[i] < day[old]){
                        old = i;
                    }
                }
            } else if(year[i] > year[young]){
                young = i;
            } else if (year[i] == year[young]){
                if(month[i] > month[young]){
                    young = i;
                } else if (month[i] == month[young]){
                    if(day[i] > day[young]){
                        young = i;
                    }
                }
            }
        }

        System.out.println(name[young]);
        System.out.println(name[old]);
    }
}
