import sys

n = int(input())

s = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

result = 1e9

visited = [0] * n

def dfs(depth, idx):
    global result

    if depth == n//2:
        start = 0
        link = 0
        for i in range(n):
            for j in range(n):
                if visited[i] and visited[j]:
                    start += s[i][j]
                elif not visited[i] and not visited[j]:
                    link += s[i][j]
        result = min(result, abs(start - link))
        return
    for i in range(idx, n):
        if not visited[i]:
            visited[i] = 1
            dfs(depth + 1, i+1)
            visited[i] = 0

dfs(0,0)
print(result)

