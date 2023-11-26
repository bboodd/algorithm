import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	//주사위
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(br.readLine());
		int[] dice = new int[6];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<6;i++) {
			dice[i] = Integer.parseInt(st.nextToken());
		}
		
		if(N == 1) {
			Arrays.sort(dice);
			int sum = 0;
			
			for(int i=0;i<5;i++) {
				sum += dice[i];
			}
			
			System.out.println(sum);
			
		} else {
			long sum = 0;
			
			long oneSide = Long.MAX_VALUE;
			
			for(int i=0;i<6;i++) {
				oneSide = Math.min(oneSide, dice[i]);
			}
			
			sum += ( 5 * (N-2) * (N-2) + 4 * (N-2) ) * oneSide;
			
			long twoSide = Long.MAX_VALUE;
			
			for (int i = 0; i < 6; i++) {
				for (int j = i + 1; j < 6; j++) {
					if (j + i != 5) {
						twoSide = Math.min(twoSide, dice[i] + dice[j]);
					}
				}
			}
			
			sum += ( 8 * (N-2) + 4 ) * twoSide;
			
			long threeSide = Long.MAX_VALUE;
			
			long temp1 = Math.min(dice[0], dice[5]);
			long temp2 = Math.min(dice[2], dice[3]);
			long temp3 = Math.min(dice[1], dice[4]);
			threeSide = temp1 + temp2 + temp3;
			
			sum += 4 * threeSide;
			
			System.out.println(sum);
		}
	}

}