from collections import deque

n = int(input())
r1, c1, r2, c2 = map(int, input().split())

board = [[-1] * n for _ in range(n)]

dx = [-2, -2, 0, 0, 2, 2]
dy = [-1, 1, -2, 2, -1, 1]

def bfs(r1, c1, r2, c2):
    queue = deque()
    queue.append([r1, c1])
    board[r1][c1] = 0

    while queue:
        x, y = queue.popleft()

        if x == r2 and y == c2:
            return board[x][y]
        
        for i in range(6):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < n and 0 <= ny < n and board[nx][ny] == -1:
                board[nx][ny] = board[x][y] + 1
                queue.append((nx, ny))

    return -1

print(bfs(r1, c1, r2, c2))
