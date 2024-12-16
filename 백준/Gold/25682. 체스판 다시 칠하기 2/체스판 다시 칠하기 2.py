import sys

n, m, k = map(int, sys.stdin.readline().split())

board = []

for _ in range(n):
    board.append(list(sys.stdin.readline().strip()))

white = [[0 for _ in range(m)] for _ in range(n)]
black = [[0 for _ in range(m)] for _ in range(n)]

if board[0][0] == 'W':
    black[0][0] = 1
else:
    white[0][0] = 1

for i in range(1, n): # 첫번째 열
    if i % 2 != 0: # 짝수 행이라면
        if board[i][0] == 'W':
            black[i][0] = black[i-1][0]
            white[i][0] = white[i-1][0] + 1
        else:
            black[i][0] = black[i-1][0] + 1
            white[i][0] = white[i-1][0]
    else: # 홀수 행이라면
        if board[i][0] == 'W':
            black[i][0] = black[i-1][0] + 1
            white[i][0] = white[i-1][0]
        else:
            black[i][0] = black[i-1][0]
            white[i][0] = white[i-1][0] + 1

for i in range(1, m): # 첫번째 행
    if i % 2 != 0: # 짝수 열이라면
        if board[0][i] == 'W':
            black[0][i] = black[0][i-1]
            white[0][i] = white[0][i-1] + 1
        else:
            black[0][i] = black[0][i-1] + 1
            white[0][i] = white[0][i-1]
    else: # 홀수 열이라면
        if board[0][i] == 'W':
            black[0][i] = black[0][i-1] + 1
            white[0][i] = white[0][i-1]
        else:
            black[0][i] = black[0][i-1]
            white[0][i] = white[0][i-1] + 1

for i in range(1, n):
    for j in range(1, m):
        if i % 2 != 0: # 짝수 행일때
            if j % 2 != 0: # 짝수 열이라면
                if board[i][j] == 'W':
                    black[i][j] = black[i-1][j] + black[i][j-1] - black[i-1][j-1] + 1
                    white[i][j] = white[i-1][j] + white[i][j-1] - white[i-1][j-1]
                else:
                    black[i][j] = black[i-1][j] + black[i][j-1] - black[i-1][j-1]
                    white[i][j] = white[i-1][j] + white[i][j-1] - white[i-1][j-1] + 1
            else: # 홀수 열이라면
                if board[i][j] == 'W':
                    black[i][j] = black[i-1][j] + black[i][j-1] - black[i-1][j-1]
                    white[i][j] = white[i-1][j] + white[i][j-1] - white[i-1][j-1] + 1
                else:
                    black[i][j] = black[i-1][j] + black[i][j-1] - black[i-1][j-1] + 1
                    white[i][j] = white[i-1][j] + white[i][j-1] - white[i-1][j-1]
        else: # 홀수 행 일때
            if j % 2 != 0: # 짝수 열이라면
                if board[i][j] == 'W':
                    black[i][j] = black[i-1][j] + black[i][j-1] - black[i-1][j-1]
                    white[i][j] = white[i-1][j] + white[i][j-1] - white[i-1][j-1] + 1
                else:
                    black[i][j] = black[i-1][j] + black[i][j-1] - black[i-1][j-1] + 1
                    white[i][j] = white[i-1][j] + white[i][j-1] - white[i-1][j-1]
            else: # 홀수 열이라면
                if board[i][j] == 'W':
                    black[i][j] = black[i-1][j] + black[i][j-1] - black[i-1][j-1] + 1
                    white[i][j] = white[i-1][j] + white[i][j-1] - white[i-1][j-1]
                else:
                    black[i][j] = black[i-1][j] + black[i][j-1] - black[i-1][j-1] 
                    white[i][j] = white[i-1][j] + white[i][j-1] - white[i-1][j-1] + 1

minimum = n * m + 1

for i in range(n):
    for j in range(m):
        nx = i + k - 1
        ny = j + k - 1
        if nx < n and ny < m:
            if i == 0 and j == 0:
                minimum = min(minimum, black[nx][ny], white[nx][ny])
            elif i == 0:
                minimum = min(minimum, black[nx][ny] - black[nx][j-1], white[nx][ny] - white[nx][j-1])
            elif j == 0:
                minimum = min(minimum, black[nx][ny] - black[i-1][ny], white[nx][ny] - white[i-1][ny])
            else:
                minimum = min(minimum, black[nx][ny] - black[nx][j-1] - black[i-1][ny] + black[i-1][j-1], white[nx][ny] - white[nx][j-1] - white[i-1][ny] + white[i-1][j-1])

print(minimum)

