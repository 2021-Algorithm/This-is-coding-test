# x = 상 하
# y = 좌 우
def dfs(x, y, n, m, graph):
    if x < 0 or y < 0 or x >= n or y >= m:
        return False

    if graph[x][y] == 0:
        graph[x][y] = 1

        dfs(x - 1, y, n, m, graph)
        dfs(x, y - 1, n, m, graph)
        dfs(x + 1, y, n, m, graph)
        dfs(x, y + 1, n, m, graph)
        return True

    return False


def feeze_drinks(n, m, graph):
    answer = 0

    for i in range(n):
        for j in range(m):
            print(i, j)
            if dfs(i, j, n, m, graph):
                answer += 1

    return answer


if __name__ == '__main__':
    '''
    # n, m 입력
    # n = 4, m = 5
    n, m = map(int, input().split())
    '''

    '''
    #예제 1 예시
    00110
    00011
    11111
    00000
    '''

    '''
    graph = []
    for i in range(n):
        graph.append(list(map(int, input())))
    print("graph = ", graph)
    '''

    print(feeze_drinks(4, 5, [[0, 0, 1, 1, 0],
                              [0, 0, 0, 1, 1],
                              [1, 1, 1, 1, 1],
                              [0, 0, 0, 0, 0]]))
