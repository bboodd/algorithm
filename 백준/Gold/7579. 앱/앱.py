import sys

n, m = map(int, sys.stdin.readline().split())
memories = [0] + list(map(int, sys.stdin.readline().split()))
costs = [0] + list(map(int, sys.stdin.readline().split()))
dp = [[0 for _ in range(sum(costs)+1)] for _ in range(n+1)]
result = sum(costs)

for i in range(1, n+1):
    memory = memories[i]
    cost = costs[i]

    for j in range(sum(costs)+1):
        if j < cost:
            dp[i][j] = dp[i-1][j]
        else:
            dp[i][j] = max(memory + dp[i-1][j-cost], dp[i-1][j])
        
        if dp[i][j] >= m:
            result = min(result, j)

print(result)