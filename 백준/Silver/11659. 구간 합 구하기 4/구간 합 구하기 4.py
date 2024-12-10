import sys

n, m = map(int, sys.stdin.readline().split())

arr = list(map(int, sys.stdin.readline().split()))

sum_arr = [0]

temp_sum = 0

for i in arr:
    temp_sum += i
    sum_arr.append(temp_sum)

for _ in range(m):
    i, j = map(int, sys.stdin.readline().split())
    print(sum_arr[j] - sum_arr[i-1])