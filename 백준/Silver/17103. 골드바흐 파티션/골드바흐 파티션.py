import sys

case = int(sys.stdin.readline().strip())

# 에라토스테네스의 체 구하기
prime_arr = set(range(2, 1000001))
for i in range(2, 1000001):
    if i in prime_arr:
        prime_arr -= set(range(2*i, 1000001, i))

for _ in range(case):
    n = int(sys.stdin.readline().strip())

    count = 0
    partition = set()
    
    for i in prime_arr:
        # n에서 소수를 뺀 값이 소수 배열에 있고 파티션에 없다면
        # 카운트 + 파티션에 추가
        if n-i in prime_arr and n-i not in partition:
            count += 1
            partition.add(i)
            partition.add(n-i)

    sys.stdout.write(str(count)+"\n")
    sys.stdout.flush()