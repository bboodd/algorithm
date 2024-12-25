k, n = map(int, input().split())
lan = []

for _ in range(k):
    lan.append(int(input()))

start = 1
end = max(lan)

while start <= end:
    mid = (start + end) // 2
    count = 0

    for l in lan:
        count += l // mid

    if count >= n:
        start = mid + 1
    else:
        end = mid - 1

print(end)