def solution(n, m, rice_cake_length):
    answer = []
    start, end = 0, max(rice_cake_length)

    while start <= end:

        cut_length = 0

        mid = (start + end) // 2

        for rice_cake in rice_cake_length:

            if rice_cake > mid:
                cut_length += rice_cake - mid

        if cut_length < m:
            end = mid - 1
        else:
            answer.append(mid)
            start = mid + 1

    return max(answer)


if __name__ == '__main__':
    n = 4
    m = 6
    rice_cake_length = [19, 15, 10, 17]

    print(solution(n, m, rice_cake_length))
