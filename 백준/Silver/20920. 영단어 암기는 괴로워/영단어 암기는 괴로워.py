import sys

n, m = map(int, sys.stdin.readline().split())

_dict = {}

for _ in range(n):
    word = sys.stdin.readline().rstrip()

    if len(word) < m:
        continue

    if word in _dict:
        _dict[word] += 1
    else:
        _dict[word] = 1

sort_dict = sorted(_dict.items(), key=lambda x: (-x[1], -len(x[0]), x[0]))

for i in sort_dict:
    sys.stdout.write(str(i[0])+"\n")
    