n = int(input())
p = 1000000007

def matrix_multiple(a, b):
    result = [[0 for _ in range(2)] for _ in range(2)]

    for i in range(2):
        for j in range(2):
            for k in range(2):
                result[i][j] += a[i][k] * b[k][j] % p
    
    return result

def reduce_pow(a, b):
    if b == 1:
        for i in range(2):
            for j in range(2):
                a[i][j] %= p
        return a
    
    reduce = reduce_pow(a, b//2)

    if b % 2 == 0:
        return matrix_multiple(reduce, reduce)
    else:
        return matrix_multiple(a, matrix_multiple(reduce, reduce))


fib_matrix = [[1, 1], [1, 0]]
matrix = reduce_pow(fib_matrix, n)

print(matrix[1][0] % p)