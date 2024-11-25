from collections import deque

import sys

n = int(input())

is_queuestack = list(map(int, sys.stdin.readline().split()))

queuestack = list(map(int, sys.stdin.readline().split()))

queue = deque()

for i in range(n):
    if is_queuestack[i] == 0:
        queue.append(queuestack[i])

m = int(input())

c = list(map(int, sys.stdin.readline().split()))

answer = []

for c_num in c:
    if queue:
        queue.appendleft(c_num)
        answer.append(queue.pop())
    else:
        answer.append(c_num)

print(" ".join(map(str, answer)))
