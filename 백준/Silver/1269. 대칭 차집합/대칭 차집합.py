n, m = map(int, input().split(" "))

a_arr = list(map(int, input().split(" ")))
b_arr = list(map(int, input().split(" ")))

a_set = set(a_arr)
b_set = set(b_arr)

print(len(a_set-b_set)+len(b_set-a_set))