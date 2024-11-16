a, b = map(int, input().split(" "))
c, d = map(int, input().split(" "))

def gcd(a, b):
    while b > 0:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

bd_lcm = lcm(b, d)

ac_sum = (a * (bd_lcm // b)) + (c * (bd_lcm // d))

while True:
    total_gcd = gcd(ac_sum, bd_lcm)
    if total_gcd == 1:
        break
    bd_lcm = bd_lcm // total_gcd
    ac_sum = ac_sum // total_gcd

print(ac_sum, end=" ")
print(bd_lcm)