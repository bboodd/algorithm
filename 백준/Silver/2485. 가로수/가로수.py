n = int(input())
arr = []

def gcd(a, b):
    while b!=0:
        a, b = b, a % b
    return a

for _ in range(n):
    arr.append(int(input()))

min_gcd = arr[1] - arr[0]
for i in range(1, n):
    sub = arr[i] - arr[i-1]
    min_gcd = gcd(min_gcd, sub)

min_tree = 0

for i in range(1, len(arr)):
    sub = arr[i] - arr[i-1]
    min_tree += sub // min_gcd - 1

print(min_tree)