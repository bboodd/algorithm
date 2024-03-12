import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int maxX = -100001;
		int maxY = -100001;

		int minX = 1000001;
		int minY = 1000001;  

		for(int i=0;i<n;i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			maxX = Math.max(a,maxX);
			minX = Math.min(a,minX);

			maxY = Math.max(b,maxY);
			minY = Math.min(b,minY);
		}		
		
		System.out.println((maxX-minX) * (maxY-minY));
	}
}