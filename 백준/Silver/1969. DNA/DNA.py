n, m = map(int, input().split())
arr = []
for _ in range(n):
    arr.append(list(input()))

answer_cnt = 0
answer_str = ''
dna = ['A', 'C', 'G', 'T']

for i in range(m):
    A_cnt = 0
    T_cnt = 0
    G_cnt = 0
    C_cnt = 0
    for j in range(n):
        if arr[j][i] == 'A':
            A_cnt += 1
        elif arr[j][i] == 'T':
            T_cnt += 1
        elif arr[j][i] == 'G':
            G_cnt += 1
        else:
            C_cnt += 1
    
    count_list = [A_cnt, C_cnt, G_cnt, T_cnt]
    selected_dna = dna[count_list.index(max(count_list))]
    answer_str += selected_dna
    for k in range(n):
        if arr[k][i] != selected_dna:
            answer_cnt += 1

print(answer_str)
print(answer_cnt)
