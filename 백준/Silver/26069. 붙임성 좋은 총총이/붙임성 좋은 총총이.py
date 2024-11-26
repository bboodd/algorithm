n = int(input())

dance = set({"ChongChong"})

for _ in range(n):
    peoples = input().split()

    for people in peoples:
        if people in dance:
            dance |= set(peoples)

print(len(dance))