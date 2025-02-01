import sys
sys.setrecursionlimit(10**7)

m, n = map(int, sys.stdin.readline().split())
board = []
for _ in range(m):
    board.append(list(map(int, sys.stdin.readline().split())))

visited = [[False] * n for _ in range(m)]
dx = [0, 0, 1, -1, 1, -1, 1, -1]
dy = [1, -1, 0, 0, 1, -1, -1, 1]

def dfs(x, y):
    visited[x][y] = True

    for i in range(8):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < m and 0 <= ny < n and not visited[nx][ny] and board[nx][ny]:
            dfs(nx, ny)

answer = 0
for i in range(m):
    for j in range(n):
        if not visited[i][j] and board[i][j]:
            dfs(i, j)
            answer += 1

print(answer)
