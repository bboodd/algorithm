n, k = map(int, input().split())

arr = list(map(int, input().split()))

sum_arr = []

temp = 0

for i in arr:
    temp += i
    sum_arr.append(temp)

maximum = sum_arr[k-1]

for i in range(k, n):
    maximum = max(maximum, sum_arr[i]-sum_arr[i-k])

print(maximum)


