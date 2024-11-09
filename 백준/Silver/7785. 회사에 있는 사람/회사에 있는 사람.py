import sys

n = int(sys.stdin.readline())
_dict = {}
for i in range(n):
    name, status = sys.stdin.readline().strip().split(' ')
    _dict[name] = status

for key in sorted(_dict, reverse=True):
    if _dict[key] == "enter":
        print(key)