import sys

n = int(sys.stdin.readline())
wine = []

for _ in range(n):
    wine.append(int(sys.stdin.readline()))

if n <=2:
    print(sum(wine))
else:
    dp = [0 for _ in range(n)]
    dp[0] = wine[0]
    dp[1] = wine[0] + wine[1]
    dp[2] = max(wine[2]+wine[1],
                 wine[2]+wine[0],
                   dp[1])

    for i in range(3, n):
        dp[i] = max(dp[i-1], # 포도주 마시지 않음
                     wine[i]+wine[i-1]+dp[i-3], # 현재 + 전
                      wine[i]+dp[i-2]) # 현재 + 전전
    
    print(dp[n-1])

