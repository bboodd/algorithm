import sys

n, s = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))

if sum(arr) < s:
    print(0)
else:
    answer = n
    point_left = 0
    point_right = 0
    temp = 0

    while True:
        if temp >= s:
            answer = min(answer, point_right - point_left)
            temp -= arr[point_left]
            point_left += 1
        elif point_right == n:
            break
        else:
            temp += arr[point_right]
            point_right += 1

    print(answer)
    