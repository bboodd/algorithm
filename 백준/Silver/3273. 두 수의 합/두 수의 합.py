n = int(input())
arr = list(map(int, input().split()))
x = int(input())

point_left = 0
point_right = n-1
answer = 0
arr.sort()

while point_left < point_right:
    temp = arr[point_left] + arr[point_right]
    if temp == x:
        answer += 1
        point_left += 1
    elif temp < x:
        point_left += 1
    else:
        point_right -= 1

print(answer)
