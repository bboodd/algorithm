n = int(input())

dp = [1] * n

line = []

for _ in range(n):
    a, b = map(int, input().split())
    line.append((a,b))

line.sort()

for i in range(n):
    for j in range(i):
        if line[i][1] > line[j][1]:
            dp[i] = max(dp[i], dp[j]+1)

print(n-max(dp))