def sorting(dic):
    return " ".join([key for key, val in sorted(dic.items(), key=lambda x: x[1])])


if __name__ == '__main__':
    n = int(input())
    dic = {}
    for i in range(n):
        student = input().split()
        dic[student[0]] = int(student[1])

    print(sorting(dic))
