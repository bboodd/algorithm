import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int t = Integer.parseInt(br.readLine());

    for (int i=0; i<t; i++) {
      StringBuilder sb = new StringBuilder();
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      int size = Integer.parseInt(br.readLine());
      List<Integer> answer = new ArrayList<>();

      for (int j=0; j<=size/10; j++) {
        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
          pq.add(Integer.parseInt(st.nextToken()));

          if (pq.size()%2 != 0) {
            // 중앙값 찾기
            List<Integer> temp = new ArrayList<>();
            if (pq.size() == 1) {
              answer.add(pq.peek());
            } else {
              int half = pq.size()/2;
              for (int k=0; k<half; k++) {
                temp.add(pq.poll());
              }
              answer.add(pq.peek());
              pq.addAll(temp);
            }
          }
        }
      }

      System.out.println(answer.size());

      int count = 0;
      for (int j=0; j<answer.size(); j++) {
        sb.append(answer.get(j)).append(' ');
        count++;
        if (count == 10) {
          System.out.println(sb);
          sb.setLength(0);
          count = 0;
        }
      }

      if (sb.length()>0) {
        System.out.println(sb);
      }
    }
  }

}
