n = int(input())

numbers = list(map(int, input().split()))

op = list(map(int, input().split()))

maximum = -1e9
minimum = 1e9

def dfs(depth, total, plus, minus, multiply, divide):
    global maximum, minimum

    if depth == n:
        maximum = max(total, maximum)
        minimum = min(total, minimum)
        return
    
    if plus:
        dfs(depth + 1, total+numbers[depth], plus-1, minus, multiply, divide)
    if minus:
        dfs(depth + 1, total-numbers[depth], plus, minus-1, multiply, divide)
    if multiply:
        dfs(depth + 1, total*numbers[depth], plus, minus, multiply-1, divide)
    if divide:
        dfs(depth + 1, int(total / numbers[depth]), plus, minus, multiply, divide-1)

dfs(1, numbers[0], op[0], op[1], op[2], op[3])
print(maximum)
print(minimum)
