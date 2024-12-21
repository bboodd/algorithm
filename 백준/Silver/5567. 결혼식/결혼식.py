from collections import deque

n = int(input())
m = int(input())

visited = [0] * n
graph = [[0 for _ in range(n)] for _ in range(n)]

for _ in range(m):
    a, b = map(int, input().split())
    graph[a-1][b-1] = 1
    graph[b-1][a-1] = 1

visited[0] = 1
q = deque()

answer = 0

for i in range(n):
    if graph[0][i] == 1:
        q.append(i)
        visited[i] = 1
        answer += 1

while q:
    current = q.popleft()
    for i in range(n):
        if graph[current][i] == 1 and visited[i] == 0:
            visited[i] = 1
            answer += 1

print(answer)