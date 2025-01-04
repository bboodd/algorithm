from collections import deque

r, c = map(int, input().split())
board = []
for _ in range(r):
    board.append(list(input()))

visited = [[0 for _ in range(c)] for _ in range(r)]
dx = [0,0,-1,1]
dy = [-1,1,0,0]
v_answer = 0
k_answer = 0
queue = deque([])

def bfs(row, col):
    global v_answer, k_answer
    queue.append([row, col])
    visited[row][col] = 1

    k_cnt = 0
    v_cnt = 0

    while queue:
        x, y = queue.popleft()

        if board[x][y] == 'v':
            v_cnt += 1
        elif board[x][y] == 'k':
            k_cnt += 1
        
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx and nx < r and 0 <= ny and ny < c:
                if visited[nx][ny] == 0 and board[nx][ny] != '#':
                    visited[nx][ny] = 1
                    queue.append([nx, ny])

    if v_cnt >= k_cnt:
        v_answer += v_cnt
    else:
        k_answer += k_cnt
        

for i in range(r):
    for j in range(c):
        if board[i][j] != '#' and visited[i][j] == 0:
            bfs(i, j)


print(k_answer, v_answer)