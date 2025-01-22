from collections import deque

n, m = map(int, input().split())
board = [0] * 101
visited = [False] * 101

ladder = dict()
snake = dict()

for _ in range(n):
    x, y = map(int, input().split())
    ladder[x] = y

for _ in range(m):
    x, y = map(int, input().split())
    snake[x] = y

queue = deque()
queue.append(1)

while queue:
    now = queue.popleft()

    if now == 100:
        print(board[now])
        break

    for dice in range(1, 7):
        next = now + dice

        if next <= 100 and not visited[next]:
            if next in ladder:
                next = ladder[next]
            if next in snake:
                next = snake[next]
            if not visited[next]:
                visited[next] = True
                board[next] = board[now] + 1
                queue.append(next)

