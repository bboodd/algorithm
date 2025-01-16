import sys

n = int(sys.stdin.readline())
arr = []
for _ in range(n):
    arr.append(int(sys.stdin.readline()))

stack = []
answer = 0

for i in range(n):
    idx = i

    while stack and stack[-1][1] > arr[i]:
        idx, height = stack.pop()
        result = (i - idx) * height
        answer = max(answer, result)
    
    stack.append((idx, arr[i]))

while stack:
    idx, height = stack.pop()
    result = (n - idx) * height
    answer = max(answer, result)

print(answer)