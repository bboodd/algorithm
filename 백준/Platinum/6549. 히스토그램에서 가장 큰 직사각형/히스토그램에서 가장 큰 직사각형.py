
def divide_histogram(histogram, start, end):
    if end == start:
        return histogram[end]
    elif end - start == 1:
        if histogram[end] < histogram[start]:
            return max(2*histogram[end], histogram[start])
        else:
            return max(2*histogram[start], histogram[end])
    
    mid = (start + end) // 2
    left_area = divide_histogram(histogram, start, mid)
    right_area = divide_histogram(histogram, mid+1, end)
    left = mid - 1
    right = mid + 1
    mid_area = histogram[mid]
    now_hight = histogram[mid]

    while start <= left and right <= end:
        if histogram[left] < histogram[right]:
            if histogram[right] < now_hight:
                now_hight = histogram[right]
            mid_area = max(mid_area, now_hight * (right - left))
            right += 1
        else:
            if histogram[left] < now_hight:
                now_hight = histogram[left]
            mid_area = max(mid_area, now_hight * (right - left))
            left -= 1
    
    while start <= left:
        if histogram[left] < now_hight:
            now_hight = histogram[left]
        mid_area = max(mid_area, now_hight * (right - left))
        left -= 1
    
    while right <= end:
        if histogram[right] < now_hight:
            now_hight = histogram[right]
        mid_area = max(mid_area, now_hight * (right - left))
        right += 1

    return max(left_area, right_area, mid_area)


while True:
    histogram = list(map(int, input().split()))

    if histogram[0] == 0:
        break

    n = histogram[0]

    print(divide_histogram(histogram, 1, n))