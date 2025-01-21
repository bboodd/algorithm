from collections import deque

n = int(input())
arr = []
for _ in range(n):
    arr.append(list(map(int, input().split())))

def bfs(node, line):
    
    queue = deque()
    queue.append(line)

    while queue:
        pop_node = queue.popleft()

        for i in range(n):
            if arr[pop_node][i] == 1 and arr[node][i] == 0:
                arr[node][i] = 1
                queue.append(i)

for i in range(n):
    for j in range(n):
        if arr[i][j] == 1:
            bfs(i, j)

for i in range(n):
    print(*arr[i])