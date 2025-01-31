from collections import deque

n, k = map(int, input().split())
queue = deque()
queue.append(n)
visited = [-1 for _ in range(100001)]
visited[n] = 0

while queue:
    x = queue.popleft()

    if x == k:
        print(visited[x])
        break
    if 0 <= x-1 < 100001 and visited[x-1] == -1:
        visited[x-1] = visited[x] + 1
        queue.append(x-1)
    if 0 < x*2 < 100001 and visited[x*2] == -1:
        visited[x*2] = visited[x]
        queue.appendleft(x*2)
    if 0 <= x+1 < 100001 and visited[x+1] == -1:
        visited[x+1] = visited[x] + 1
        queue.append(x+1)
        