from collections import deque
import sys

k = int(sys.stdin.readline())

def bfs(start, flag):
    queue = deque()
    queue.append(start)
    visited[start] = flag

    while queue:
        pop_node = queue.popleft()

        for i in graph[pop_node]:
            if not visited[i]:
                queue.append(i)
                visited[i] = -1 * visited[pop_node]
            elif visited[i] == visited[pop_node]:
                return False
    return True


for _ in range(k):
    v, e = map(int, sys.stdin.readline().split())
    graph = [[] for _ in range(v+1)]
    visited = [0] * (v+1)

    for _ in range(e):
        a, b = map(int, sys.stdin.readline().split())
        graph[a].append(b)
        graph[b].append(a)

    for i in range(1, v+1):
        if not visited[i]:
            answer = bfs(i, 1)
            if not answer:
                break
    
    print('YES' if answer else 'NO')
