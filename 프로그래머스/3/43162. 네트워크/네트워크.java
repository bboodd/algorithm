class Solution {
    static int[] visited;
    static int[][] graph;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new int[n];
        graph = computers;
        
        for (int i=0;i<n;i++) {
            if (visited[i] == 0) {
                dfs(i);
                answer++;
            }
        }
        
        return answer;
    }
    
    static void dfs(int node) {
        visited[node] = 1;
        
        for (int i = 0; i < graph[node].length; i++) {
            if (visited[i] == 0 && graph[node][i] == 1) {
                dfs(i);
            }
        }
        
    }
}