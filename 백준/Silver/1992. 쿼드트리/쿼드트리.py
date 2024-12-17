import sys
sys.setrecursionlimit(10**7)

n = int(sys.stdin.readline())

board = []
for _ in range(n):
    board.append(list(sys.stdin.readline().strip()))

answer = ""
def quad(x, y, n):
    global answer
    color = board[x][y]
    for i in range(x, x+n):
        for j in range(y, y+n):
            if color != board[i][j]:
                answer += '('
                quad(x, y, n//2)
                quad(x, y+n//2, n//2)
                quad(x+n//2, y, n//2)
                quad(x+n//2, y+n//2, n//2)
                answer += ')'
                return
    answer += color

quad(0,0,n)
print(answer)
