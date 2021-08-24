from collections import deque


def escape_the_maze(n, m, graph):
    dx = [-1, 1, 0, 0]  # 상하좌우
    dy = [0, 0, -1, 1]
    queue = deque([(0, 0)])

    n, m = n - 1, m - 1

    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or ny < 0 or nx > n or ny > m:
                continue

            if graph[nx][ny] == 1:
                graph[nx][ny] = graph[x][y] + 1
                queue.append((nx, ny))

    return graph[n][m]


if __name__ == '__main__':
    '''
    # n, m 입력
    # n = 5, m = 6
    n, m = map(int, input().split())
    '''

    '''
    #예제 1 예시
    101010
    111111
    000001
    111111
    111111
    '''

    '''
    graph = []
    for i in range(n):
        graph.append(list(map(int, input())))
    print("graph = ", graph)
    '''

    print(escape_the_maze(5, 6, [[1, 0, 1, 0, 1, 0],
                                 [1, 1, 1, 1, 1, 1],
                                 [0, 0, 0, 0, 0, 1],
                                 [1, 1, 1, 1, 1, 1],
                                 [1, 1, 1, 1, 1, 1]]))
