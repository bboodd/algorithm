n, k = map(int, input().split())

c = 1000000007

def factorial(a):
    temp = 1
    for i in range(2, a+1):
        temp = (temp * i) % c
    return temp

def reduce_pow(a, b):
    if b == 1:
        return a % c
    
    x = reduce_pow(a, b//2)

    if b % 2 == 0:
        return x * x % c
    else:
        return a * x * x % c
    
top = factorial(n)
down = factorial(k) * factorial(n-k)

print(top * reduce_pow(down, c-2) % c)