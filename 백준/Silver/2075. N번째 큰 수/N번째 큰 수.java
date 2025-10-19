import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j=0; j<n; j++) {
				pq.add(Integer.parseInt(st.nextToken()));
			}
 		}

		for (int i=0; i<n-1; i++) {
			pq.remove();
		}

		bw.write(String.valueOf(pq.poll()));
		bw.flush();
		bw.close();
	}
}
