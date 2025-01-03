import sys
sys.setrecursionlimit(10**6)

m, n = map(int, sys.stdin.readline().split())
board = []
for _ in range(m):
    board.append(list(map(int, sys.stdin.readline().split())))

dp = [[-1 for _ in range(n)] for _ in range(m)]
dx = [0, 0, 1, -1]
dy = [-1, 1, 0, 0]

def dfs(row, col):
    if row == m-1 and col == n-1:
        return 1
    
    if dp[row][col] == -1:
        dp[row][col] = 0
        
        for i in range(4):
            nx = row + dx[i]
            ny = col + dy[i]

            if nx >= 0 and nx < m and ny >= 0 and ny < n:
                if board[row][col] > board[nx][ny]:
                    dp[row][col] += dfs(nx, ny)
        
    return dp[row][col]

print(dfs(0, 0))