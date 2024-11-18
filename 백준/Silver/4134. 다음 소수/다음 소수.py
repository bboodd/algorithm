case = int(input())

def is_prime (number):
    for i in range(2, int(number**0.5)+1):
        if number % i == 0:
            return False
    return True
    

for i in range(case):
    n = int(input())
    while True:
        if n == 0 or n == 1:
            print(2)
            break
        if is_prime(n):
            print(n)
            break
        
        n+=1


