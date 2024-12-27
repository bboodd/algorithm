n, m = map(int, input().split())
trees = list(map(int, input().split()))

start = 1
end = max(trees)
hight = 0

while start <= end:
    mid = (start + end) //2
    takes = 0

    for i in trees:
        if mid < i:
            takes += (i-mid)

    if takes >= m:
        hight = max(hight, mid)
        start = mid + 1
    else:
        end = mid - 1

print(hight)
