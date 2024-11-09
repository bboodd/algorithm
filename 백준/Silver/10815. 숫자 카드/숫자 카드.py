n  = int(input())
have_numbers = list(map(int, input().split(" ")))
m = int(input())
check_numbers = list(map(int, input().split(" ")))

set_numbers = set(check_numbers) - set(have_numbers)

for i in check_numbers:
    if i in set_numbers:
        print(0, end=' ')
    else:
        print(1, end=' ')