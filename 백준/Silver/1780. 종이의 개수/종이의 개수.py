n = int(input())

arr = []

for _ in range(n):
    arr.append(list(map(int, input().split())))

minus_cnt = 0
zero_cnt = 0
plus_cnt = 0
def quad(x, y, n):
    global minus_cnt, zero_cnt, plus_cnt
    temp = arr[x][y]

    for i in range(x, x+n):
        for j in range(y, y+n):
            if temp != arr[i][j]:
                n = n // 3
                quad(x, y, n)
                quad(x, y+n, n)
                quad(x, y+n+n, n)
                quad(x+n, y, n)
                quad(x+n, y+n, n)
                quad(x+n, y+n+n, n)
                quad(x+n+n, y, n)
                quad(x+n+n, y+n, n)
                quad(x+n+n, y+n+n, n)
                return

    if temp == -1:
        minus_cnt += 1
    elif temp == 0:
        zero_cnt += 1
    else:
        plus_cnt += 1

quad(0,0,n)
print(minus_cnt)
print(zero_cnt)
print(plus_cnt)
