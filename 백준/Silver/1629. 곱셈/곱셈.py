a, b, c = map(int, input().split())

def reduce_pow(a, b, c):
    if b == 1:
        return a % c
    
    reduce = reduce_pow(a, b//2, c)

    if b % 2 == 0:
        return reduce * reduce % c
    else:
        return a * reduce * reduce % c
    
print(reduce_pow(a, b, c))