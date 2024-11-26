n = int(input())

count = 0

set_arr = set()

for _ in range(n):
    chat = input()

    if chat == "ENTER":
        count += len(set_arr)
        set_arr = set()
    else:
        set_arr.add(chat)

print(count+len(set_arr))