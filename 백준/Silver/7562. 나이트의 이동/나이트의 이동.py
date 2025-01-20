from collections import deque
import sys
input = sys.stdin.readline
 
dx = [1, 1, 2, 2, -1, -1, -2, -2]
dy = [-2, 2, -1, 1, -2, 2, -1, 1]

t = int(input())

def bfs(x, y):
    queue = deque()
    queue.append((x, y))

    while queue:
        x, y = queue.popleft()

        if x == end_x and y == end_y:
            return board[x][y]

        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < l and 0 <= ny < l and board[nx][ny] == 0:
                queue.append((nx, ny))
                board[nx][ny] = board[x][y] + 1

for _ in range(t):
    l = int(input())
    board = [[0] * l for _ in range(l)]
    start_x, start_y = map(int, input().split())
    end_x, end_y = map(int, input().split())
    print(bfs(start_x, start_y))
    