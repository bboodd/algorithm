n = int(input())
matrix = []
for _ in range(n):
    matrix.append(list(map(int, input().split())))

dp = [[0 for _ in range(n)] for _ in range(n)]

for i in range(1, n): # 몇번째 대각선인지
    for j in range(0, n-i): # 대각선에서 몇번째인지

        if i == 1:
            dp[j][j+i] = matrix[j][0] * matrix[j][1] * matrix[j+i][1]
            continue

        dp[j][j+i] = 2**32
        for k in range(j, j+i):
            dp[j][j+i] = min(dp[j][j+i], 
                             dp[j][k] + dp[k+1][j+i] + matrix[j][0] * matrix[k][1] * matrix[j+i][1])

print(dp[0][n-1])
