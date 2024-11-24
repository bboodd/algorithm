from collections import deque

n = int(input())

queue = deque(list(map(int, input().split())))
queue2 = deque(range(1, len(queue)+1))

for _ in range(n):
    num = queue.popleft()
    print(queue2.popleft(), end=' ')
    if num < 0:
        queue.rotate((num*-1))
        queue2.rotate((num*-1))
    else:
        queue.rotate((num*-1)+1)
        queue2.rotate((num*-1)+1)
