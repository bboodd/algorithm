class Solution {
    static boolean[] visited;
    static int answer;
    
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        
        dfs(begin, target, words, 0);
        
        return answer;
    }
    
    public void dfs(String begin, String target, String[] words, int cnt) {
        if (begin.equals(target)) {
            answer = cnt;
        }
        
        for (int i=0;i<words.length;i++) {
            if (visited[i]) {
                continue;
            }
            
            int k = 0;
            for (int j=0;j<words[i].length();j++) {
                if (begin.charAt(j) == words[i].charAt(j)) {
                    k++;
                }
            }
            
            if (k == words[i].length()-1) {
                visited[i] = true;
                dfs(words[i], target, words, cnt+1);
                visited[i] = false;
            }
        }
    }
}