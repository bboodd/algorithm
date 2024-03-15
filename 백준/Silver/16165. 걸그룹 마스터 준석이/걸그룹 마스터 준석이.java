import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<List<String>> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){

            List<String> temp = new ArrayList<>();

            String group = br.readLine();
            int member = Integer.parseInt(br.readLine());
            for(int j=0;j<member;j++){
                temp.add(br.readLine());
            }

            Collections.sort(temp);
            temp.add(group);

            list.add(temp);
        }

        for(int i=0;i<m;i++){
            String quiz = br.readLine();
            
            int t = Integer.parseInt(br.readLine());

            if(t == 1){
                for(List l : list){
                    if(l.contains(quiz)){
                        System.out.println(l.get(l.size()-1));
                    }
                }
            } else{
                for(List l : list){
                    if(l.contains(quiz)){
                        for(int j=0;j<l.size()-1;j++){
                            System.out.println(l.get(j));
                        }
                    }
                }
            }
        }
    }
}