from collections import deque

n, k = map(int, input().split())
queue = deque([i for i in range(1, n+1)])
answer = []

for _ in range(n):
    queue.rotate(-k+1)
    answer.append(queue.popleft())

print('<', end='')
print(*answer, sep=', ', end='')
print('>')