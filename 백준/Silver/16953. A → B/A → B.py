a, b = map(int, input().split())
answer = int(1e9)

def dfs(num, depth):
    if num < b:
        dfs(num*10+1, depth+1)
        dfs(num*2, depth+1)
    elif num == b:
        global answer
        answer = min(answer, depth+1)
    else:
        return
    
dfs(a, 0)
    
if answer == int(1e9):
    print(-1)
else:
    print(answer)