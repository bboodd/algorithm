import sys

t = int(sys.stdin.readline())

for _ in range(t):
    k = int(sys.stdin.readline())
    file = [0] + list(map(int, sys.stdin.readline().split()))

    sum_file = [0] * (k + 1)
    for i in range(1, k + 1):
        sum_file[i] = sum_file[i - 1] + file[i]
    
    dp = list([0] * (k + 1) for _ in range(k + 1))
    for cnt in range(1, k):
        for start in range(1, k - cnt + 1):
            end = start + cnt

            dp[start][end] = min(dp[start][mid]+dp[mid+1][end] for mid in range(start, end))
            dp[start][end] += (sum_file[end] - sum_file[start-1])

    print(dp[1][k])
