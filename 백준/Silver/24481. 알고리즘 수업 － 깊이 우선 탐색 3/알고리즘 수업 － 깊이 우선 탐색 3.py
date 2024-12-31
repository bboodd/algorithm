import sys
sys.setrecursionlimit(10**6)

n, m, r = map(int, sys.stdin.readline().split())

graph = [[] for _ in range(n+1)]

for _ in range(m):
    u, v = map(int, sys.stdin.readline().split())
    graph[u].append(v)
    graph[v].append(u)

visited = [-1 for _ in range(n+1)]
def dfs(r, depth):
    visited[r] = depth
    graph[r].sort()

    for i in graph[r]:
        if visited[i] == -1:
            dfs(i, depth+1)

dfs(r, 0)

for i in range(1, n+1):
    print(visited[i])