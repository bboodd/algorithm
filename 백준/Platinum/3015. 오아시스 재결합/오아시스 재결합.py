import sys
input = sys.stdin.readline

n = int(input())
arr = []
for _ in range(n):
    arr.append(int(input()))

answer = 0
stack = [] # (height, count)로 push

for height in arr:

    while stack and stack[-1][0] < height:
        answer += stack.pop()[1]

    if not stack:
        stack.append((height, 1))
        continue

    if stack[-1][0] == height:
        count = stack.pop()[1]
        answer += count

        if stack:
            answer += 1
        
        stack.append((height, count + 1))
    else:
        stack.append((height, 1))
        answer += 1

print(answer)
