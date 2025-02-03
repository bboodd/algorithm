from collections import deque

a, b, n, m = map(int, input().split())

arr = [-1] * 100001

def bfs(start):
    queue = deque()
    queue.append(start)
    arr[start] = 0

    while queue:
        now = queue.popleft()
        
        for i in [now+1, now-1, now+a, now+b, now-a, now-b, now*a, now*b]:
            if 0 <= i <= 100000 and arr[i] == -1:
                arr[i] = arr[now] + 1
                queue.append(i)
                if i == m:
                    return

bfs(n)
print(arr[m])
            