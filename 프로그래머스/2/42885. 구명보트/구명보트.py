def solution(people, limit):
    answer = 0
    sort_list = sorted(people)
    start = 0
    end = len(sort_list)-1
    while start <= end:
        if sort_list[start] + sort_list[end] <= limit:
            start += 1
            end -= 1
        else:
            end -= 1
        answer += 1
    return answer