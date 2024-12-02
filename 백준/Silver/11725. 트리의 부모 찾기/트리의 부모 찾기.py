from collections import deque
import sys

n = int(sys.stdin.readline())

link = [[] for _ in range(n+1)]

for _ in range(n-1):
    a, b = map(int, sys.stdin.readline().split())
    link[a].append(b)
    link[b].append(a)

visited = [0] * (n+1)

queue = deque([1])

parent = [0 for _ in range(n+1)]

while queue:
    root = queue.popleft()
    visited[root] = 1

    for i in link[root]:
        if visited[i] == 0:
            queue.append(i)
            parent[i] = root

for i in range(2, n+1):
    print(parent[i])
