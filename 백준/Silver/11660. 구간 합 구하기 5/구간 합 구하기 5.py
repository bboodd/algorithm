import sys

n, m = map(int, sys.stdin.readline().split())
table = []

for _ in range(n):
    table.append(list(map(int, sys.stdin.readline().split())))

dp = [[0] * n for _ in range(n)]

for i in range(n):
    for j in range(n):
        if i == 0 and j == 0: # 1,1 칸
            dp[i][j] = table[i][j]
        elif i == 0: # 1번째 가로 줄
            dp[i][j] = dp[i][j-1] + table[i][j]
        elif j == 0: # 1번째 세로 줄
            dp[i][j] = dp[i-1][j] + table[i][j]
        else: # 나머지
            dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + table[i][j]


for _ in range(m):
    x1, y1, x2, y2 = map(int, sys.stdin.readline().split())
    x1, y1, x2, y2 = x1-1, y1-1, x2-1, y2-1

    if x1 == 0 and y1 == 0:
        print(dp[x2][y2])
    elif x1 == 0: # 옆줄 빼기
        print(dp[x2][y2] - dp[x2][y1-1])
    elif y1 == 0: # 윗줄 빼기
        print(dp[x2][y2] - dp[x1-1][y2])
    else: # 윗줄, 옆줄 빼고 왼쪽 위 더하기
        print(dp[x2][y2] - dp[x1-1][y2] - dp[x2][y1-1] + dp[x1-1][y1-1])
