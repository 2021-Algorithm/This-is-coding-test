def binary_search(array, target, start, end):
    if start > end:
        return "no"
    mid = (start + end) // 2

    if array[mid] == target:
        return "yes"
    elif array[mid] > target:
        return binary_search(array, target, start, mid - 1)
    else:
        return binary_search(array, target, mid + 1, end)


def solution(n, dong_bin, m, customer):
    answer = []

    dong_bin.sort()
    print(dong_bin)

    for i in range(m):
        answer.append(binary_search(array=dong_bin, target=customer[i], start=0, end=n - 1))

    return " ".join(answer)


if __name__ == '__main__':
    n = 5
    dong_bin = [8, 3, 7, 9, 2]

    m = 3
    customer = [5, 7, 9]

    print(solution(n, dong_bin, m, customer))
