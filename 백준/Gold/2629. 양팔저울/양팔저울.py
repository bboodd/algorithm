n = int(input())
arr1 = list(map(int, input().split()))

m = int(input())
arr2 = list(map(int, input().split()))

dp = [0]
for chu in arr1:
    temp = []
    for i in dp:
        temp.append(i+chu)
        temp.append(abs(i-chu))
    dp = list(set(dp+temp))

for check in arr2:
    print('Y' if check in dp else 'N', end=' ')