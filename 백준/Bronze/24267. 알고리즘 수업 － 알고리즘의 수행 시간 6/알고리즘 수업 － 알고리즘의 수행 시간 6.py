n = int(input())
result = sum(((i+1)*i)//2 for i in range(n-2, 0, -1))
print(result)
print(3)