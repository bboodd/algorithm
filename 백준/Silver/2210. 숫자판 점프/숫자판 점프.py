import sys
sys.setrecursionlimit(10**6)

board = []
for _ in range(5):
    board.append(list(map(int, sys.stdin.readline().split())))

answer = set()
dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

def dfs(x, y, depth, num):
    if depth == 6:
        answer.add(num)
        return
    
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if nx < 0 or nx >= 5 or ny < 0 or ny >= 5:
            continue

        dfs(nx, ny, depth+1, num*10+board[nx][ny])

for i in range(5):
    for j in range(5):
        dfs(i, j, 1, board[i][j])

print(len(answer))
