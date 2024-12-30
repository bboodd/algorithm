n = int(input())
a = list(map(int, input().split()))

lis = [a[0]]

def find_index(num):
    start = 0
    end = len(lis) - 1

    while start <= end:
        mid = (start + end) // 2

        if lis[mid] == num:
            return mid
        elif lis[mid] < num:
            start = mid + 1
        else:
            end = mid - 1
        
    return start

for i in a:
    if lis[-1] < i:
        lis.append(i)
    else:
        idx = find_index(i)
        lis[idx] = i

print(len(lis))