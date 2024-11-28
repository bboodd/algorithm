n = int(input())

def top(n, start, middle, end):
    if n == 1:
        print(start, end)
    else:
        top(n-1, start, end, middle)
        print(start, end)
        top(n-1, middle, start, end)

sum = 2**n -1
print(sum)
top(n, 1, 2, 3)