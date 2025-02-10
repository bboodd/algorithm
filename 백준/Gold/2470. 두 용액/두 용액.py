import sys

n = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split()))
arr.sort()

answer = [arr[0], arr[-1]]
point_left = 0
point_right = n-1

while point_left < point_right:
    temp = arr[point_left] + arr[point_right]
    if temp == 0:
        answer = [arr[point_left], arr[point_right]]
        break

    if abs(temp) < abs(sum(answer)):
        answer = [arr[point_left], arr[point_right]]
    
    if abs(arr[point_left]) < abs(arr[point_right]):
        point_right -= 1
    else:
        point_left += 1

print(answer[0], answer[1])
