import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //경사로

    static int[][] arr;
    static int n,l;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());

        arr = new int[n][n];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        for(int i=0;i<n;i++){
            if(calRow(i)) count++;
            if(calCol(i)) count++;
        }

        System.out.println(count);
    }

    public static boolean calRow(int row) {
        boolean[] isIncline = new boolean[n]; //경사면 설치 여부를 확인하는 배열

        for(int i = 0; i < n - 1; i++) {
            int diff = arr[row][i] - arr[row][i + 1];

            if(diff > 1 || diff < -1) return false; //높이차 1 초과하므로 false
            else if(diff == -1) { // 다음 계단이 한 계단 높다
                for(int j = 0; j < l; j++) { // 올라가는 경사로를 설치할 수 있는지 확인한다.
                    if(i - j < 0 || isIncline[i - j]) return false;
                    if(arr[row][i] != arr[row][i - j]) return false;
                    isIncline[i - j]  = true; //경사면 설치
                }
            }
            else if(diff == 1) { //다음 계단이 한 계단 낮다
                for(int j = 1; j <= l; j++) { //내려가는 경사로를 설치할 수 있는지 확인한다.
                    if(i + j >= n || isIncline[i + j]) return false;
                    if(arr[row][i] - 1 != arr[row][i + j]) return false;
                    isIncline[i + j] = true; //경사면 설치
                }
            }
        }
        return true;
    }

    public static boolean calCol(int col) {
        boolean[] isIncline = new boolean[n]; //경사면 설치 여부를 확인하는 배열

        for(int i = 0; i < n - 1; i++) {
            int diff = arr[i][col] - arr[i + 1][col];

            if(diff > 1 || diff < -1) return false; //높이차 1 초과하므로 false
            else if(diff == -1) { // 다음 계단이 한 계단 높다
                for(int j = 0; j < l; j++) { // 올라가는 경사로를 설치할 수 있는지 확인한다.
                    if(i - j < 0 || isIncline[i - j]) return false;
                    if(arr[i][col] != arr[i - j][col]) return false;
                    isIncline[i - j]  = true; //경사면 설치
                }
            }
            else if(diff == 1) { //다음 계단이 한 계단 낮다
                for(int j = 1; j <= l; j++) { //내려가는 경사로를 설치할 수 있는지 확인한다.
                    if(i + j >= n || isIncline[i + j]) return false;
                    if(arr[i][col] - 1 != arr[i + j][col]) return false;
                    isIncline[i + j] = true; //경사면 설치
                }
            }
        }
        return true;
    }
}
