n, b = map(int, input().split())
p = 1000
a = []
for _ in range(n):
    a.append(list(map(int, input().split())))

def matrix_multiple(a, b):
    result = [[0 for _ in range(n)] for _ in range(n)]

    for i in range(n):
        for j in range(n):
            for k in range(n):
                result[i][j] += a[i][k] * b[k][j]
            result[i][j] %= p
    
    return result


def reduce_pow(a, b):
    if b == 1:
        for i in range(n):
            for j in range(n):
                a[i][j] %= p
        return a
    
    reduce = reduce_pow(a, b//2)

    if b % 2 == 0:
        return matrix_multiple(reduce, reduce)
    else:
        return matrix_multiple(a, matrix_multiple(reduce, reduce))
    
answer = reduce_pow(a, b)

for i in range(n):
    print(*answer[i])