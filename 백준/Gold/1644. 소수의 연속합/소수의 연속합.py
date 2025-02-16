n = int(input())

prime_arr = [i for i in range(n+1)]
prime_arr[1] = 0

# 소수만 남기기
for i in range(2, n+1):
    if prime_arr[i] == 0:
        continue
    for j in range(i*2, n+1, i):
        prime_arr[j] = 0

point_left = 0
point_right = 0
answer = 0
temp = 0

while True:
    if temp >= n:
        if temp == n and prime_arr[point_left] != 0:
            answer += 1
        temp -= prime_arr[point_left]
        point_left += 1
    elif point_right == n+1:
        break
    else:
        temp += prime_arr[point_right]
        point_right += 1

print(answer)
