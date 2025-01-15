import sys

n = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split()))

ngf = [-1] * n
f = [0] * 1000001
stack = [0]

for num in arr:
    f[num] += 1

for i in range(1, n):
    while stack and f[arr[stack[-1]]] < f[arr[i]]:
        ngf[stack.pop()] = arr[i]
    stack.append(i)

print(*ngf)