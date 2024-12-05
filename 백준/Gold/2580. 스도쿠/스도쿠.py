import sys

board = []
zero = []

for _ in range(9):
    board.append(list(map(int, sys.stdin.readline().split())))

for i in range(9):
    for j in range(9):
        if board[i][j] == 0:
            zero.append((i, j))

def check_row(x, num):
    for i in range(9):
        if num == board[x][i]:
            return False
    return True

def check_col(y, num):
    for i in range(9):
        if num == board[i][y]:
            return False
    return True

def check_squre(x, y, num):
    nx = (x // 3) * 3
    ny = (y // 3) * 3
    for i in range(3):
        for j in range(3):
            if num == board[nx+i][ny+j]:
                return False
    return True

def dfs(cnt):
    if cnt == len(zero):
        for i in range(9):
            print(*board[i])
        exit(0)
    
    for i in range(1, 10):
        x, y = zero[cnt]

        if check_row(x, i) and check_col(y, i) and check_squre(x, y, i):
            board[x][y] = i
            dfs(cnt+1)
            board[x][y] = 0

dfs(0)