s = list(input())
bomb = list(input())

stack = []

for i in s:
    stack.append(i)
    if stack[len(stack)-len(bomb) : len(stack)] == bomb:
        for _ in range(len(bomb)):
            stack.pop()

if stack:
    print(*stack, sep='')
else:
    print('FRULA')
    