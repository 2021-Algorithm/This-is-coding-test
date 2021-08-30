def sorting(array):
    result = sorted(array, reverse=True)

    return " ".join(map(str, array))


if __name__ == '__main__':

    n = int(input()) # 3
    array = []
    for i in range(n):
        array.append(int(input())) # 15, 27, 12

    print(sorting(array))
