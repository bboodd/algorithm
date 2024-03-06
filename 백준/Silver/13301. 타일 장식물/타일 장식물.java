import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    
    long[] arr = new long[n+1];
    
    arr[0] = 1;
    arr[1] = 1;
    
    for(int i=2;i<=n;i++){
    arr[i] = arr[i-2] + arr[i-1];
    }
    
    if(n == 1){System.out.println(4);}
    else{System.out.println((arr[n-1]*4) + (arr[n-2]*2));}
  
  }
  
}