from collections import deque

n, m = map(int, input().split())
graph = [[0] * (m+1)]
for _ in range(n):
    graph.append([0] + list(map(int, input())))

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]
# 3차원 행렬
visited = [[[0] * 2 for _ in range(m+1)] for _ in range(n+1)]
visited[1][1][0] = 1

graph[1][1] = 1
queue = deque()
queue.append((1, 1, 0))

answer = -1

while queue:
    x, y, break_cnt = queue.popleft()

    if x == n and y == m:
        answer = visited[x][y][break_cnt]
        break

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if nx < 1 or nx > n or ny < 1 or ny > m:
            continue
        # 다음 이동할 곳이 벽이고, 벽파괴기회를 사용하지 않은 경우
        if graph[nx][ny] == 0 and visited[nx][ny][break_cnt] == 0:
            visited[nx][ny][break_cnt] = visited[x][y][break_cnt] + 1
            queue.append((nx, ny, break_cnt))
        # 다음 이동할 곳이 벽이 아니고, 아직 한 번도 방문하지 않은 곳이면
        elif graph[nx][ny] == 1 and break_cnt == 0:
            visited[nx][ny][1] = visited[x][y][0] + 1
            queue.append((nx, ny, 1))

print(answer)
