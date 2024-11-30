from collections import deque
import sys

def bfs(r):
    visit = 1
    visited[r] = True
    answer[r] = visit
    visit+=1
    queue = deque([r])
    
    while queue:
        now = queue.popleft()
        for i in e[now]:
            if not visited[i]:
                visited[i] = True
                answer[i] = visit
                visit+=1
                queue.append(i)

n, m, r = map(int, sys.stdin.readline().split())

answer = [0 for _ in range(n+1)]

visited = [False for _ in range(n+1)]

e = [[] for _ in range(n+1)]

for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    e[a].append(b)
    e[b].append(a)

for i in range(1, n+1):
    e[i].sort(reverse=True)

bfs(r)

for i in range(1, n+1):
    print(answer[i])