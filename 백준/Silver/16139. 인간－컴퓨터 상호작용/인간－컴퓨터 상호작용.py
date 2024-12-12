import sys

s = sys.stdin.readline()
q = int(sys.stdin.readline())
alpha = 'abcdefghijklmnopqrstuvwxyz'

sum_arr = []

for i in alpha:
    cnt = 0
    temp = [0] * len(s)
    for j in range(len(s)):
        if i == s[j]:
            cnt += 1
        temp[j] = cnt
    sum_arr.append(temp)

for _ in range(q):
    alpha, l, r = sys.stdin.readline().split()
    l = int(l)
    r = int(r)

    alpha_sum = sum_arr[ord(alpha)-ord('a')]

    if l != 0:
        print(alpha_sum[r] - alpha_sum[l-1])
    else:
        print(alpha_sum[r])
