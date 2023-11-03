import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int H, W, N, T;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			int floor = N % H;
			int room = N / H + 1;
			if(floor == 0) {
				floor = H;
				room = N / H;
			}
			if(room / 10 == 0) {
				System.out.println(floor + "0" + room);
			} else {
				System.out.println(floor + "" + room);
			}
		}
	}
}