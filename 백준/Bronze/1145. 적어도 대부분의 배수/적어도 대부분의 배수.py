arr = list(map(int, input().split()))

answer = min(arr)

while True:
    count = 0
    for i in arr:
        if answer % i == 0:
            count += 1

    if count >= 3:
        print(answer)
        break
    else:
        answer += 1
        