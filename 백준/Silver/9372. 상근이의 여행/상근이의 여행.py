from collections import deque

t = int(input())

for _ in range(t):
    n, m = map(int, input().split())
    node = [[] for _ in range(n+1)]

    for _ in range(m):
        a, b = map(int, input().split())
        node[a].append(b)
        node[b].append(a)
    
    q = deque()

    q.append(1)

    visited = [0] * (n+1)
    cnt = 0

    while q:
        now = q.popleft()
        visited[now] = 1

        for i in node[now]:
            if not visited[i]:
                visited[i] = 1
                q.append(i)
                cnt += 1
    print(cnt)