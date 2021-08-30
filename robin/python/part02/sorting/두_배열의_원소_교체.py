from collections import deque


def sorting(k, a, b):
    queue_a = deque(sorted(a))
    queue_b = deque(sorted(b, reverse=True))

    for i in range(k):
        min_a = queue_a.popleft()
        max_b = queue_b.popleft()

        if min_a > max_b:
            queue_a.append(min_a)
        else:
            queue_a.append(max_b)

    return sum(queue_a)


if __name__ == '__main__':
    k = 3
    a = [1, 2, 5, 4, 3]
    b = [5, 5, 6, 6, 5]

    print(sorting(k, a, b))
