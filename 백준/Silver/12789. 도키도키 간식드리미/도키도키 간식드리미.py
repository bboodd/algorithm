n = int(input())

stack1 = list(map(int, input().split(" ")))
stack1.reverse()

stack2 = []

answer = "Nice"

turn = 1

while stack1 or stack2:
    if not stack1 and stack2[-1] != turn:
        answer = "Sad"
        break

    if stack1 and stack1[-1] == turn:
        stack1.pop()
        turn += 1
    elif stack2 and stack2[-1] == turn:
        stack2.pop()
        turn += 1
    else:
        stack2.append(stack1.pop())

print(answer)
    