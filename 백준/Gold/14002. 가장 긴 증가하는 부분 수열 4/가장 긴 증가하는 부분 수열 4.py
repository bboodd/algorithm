n = int(input())
array = list(map(int, input().split()))
dp = [1] * n

for i in range(n):
    for j in range(i):
        if array[i] > array[j]:
            dp[i] = max(dp[i], dp[j]+1)

print(max(dp))

answer = []
temp = max(dp)
for i in range(n-1, -1, -1):
    if dp[i] == temp:
        answer.append(array[i])
        temp -= 1

answer.reverse()
print(*answer)
