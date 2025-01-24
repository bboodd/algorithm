import sys
sys.setrecursionlimit(10**6)

m, n, k = map(int, input().split())
board = [[0] * n for _ in range(m)]
visited = [[False] * n for _ in range(m)]

for _ in range(k):
    x1, y1, x2, y2 = map(int, input().split())

    for i in range(y1, y2):
        for j in range(x1, x2):
            board[i][j] = 1

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

def dfs(x, y, depth):
    visited[x][y] = True

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if nx < 0 or nx >= m or ny < 0 or ny >= n:
            continue

        if not visited[nx][ny] and board[nx][ny] == 0:
            depth = dfs(nx, ny, depth+1)
    
    return depth

answer = []
for i in range(m):
    for j in range(n):
        if not visited[i][j] and board[i][j] == 0:
            answer.append(dfs(i, j, 1))

answer.sort()
print(len(answer))
print(*answer)
