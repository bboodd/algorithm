import sys

n = int(sys.stdin.readline())
numbers = list(map(int, sys.stdin.readline().split()))

up_dp = [1 for _ in range(n)]
down_dp = [1 for _ in range(n)]

reversed_numbers = list(reversed(numbers))

for i in range(n):
    for j in range(i):
        if numbers[i] > numbers[j]:
            up_dp[i] = max(up_dp[i], up_dp[j] + 1)
        if reversed_numbers[i] > reversed_numbers[j]:
            down_dp[i] = max(down_dp[i], down_dp[j] + 1)

answer = 0
for i in range(n):
    answer = max(answer, up_dp[i] + down_dp[n-i-1])

print(answer - 1)