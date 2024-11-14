n = input()

_dict = {}

for i in range(len(n)):
    for j in range(i+1, len(n)+1):
        if n[i:j] not in _dict:
            _dict[n[i:j]] = 1

print(len(_dict))