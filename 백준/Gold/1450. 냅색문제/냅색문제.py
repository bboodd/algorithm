from itertools import combinations
import sys

n, c = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))

index = n//2

a = arr[:index]
b = arr[index:]
a_list = [0]
b_list = [0]

for i in range(1, len(a)+1):
    for j in combinations(a, i):
        a_list.append(sum(j))

for i in range(1, len(b)+1):
    for j in combinations(b, i):
        b_list.append(sum(j))

a_list.sort()
b_list.sort()
count = 0

start_pointer = 0
end_pointer = len(b_list)-1

while start_pointer < len(a_list) and end_pointer >= 0:
    if b_list[end_pointer] + a_list[start_pointer] <= c:
        count += end_pointer + 1
        start_pointer += 1
    else:
        end_pointer -= 1

print(count)
