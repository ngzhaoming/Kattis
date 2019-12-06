import sys

test = int(input())

for num in range(test):
    line = input().split(" ")
    k = int(line[0])
    n = int(line[1])

    try:
        floor = [[0 for x in range (k + 1)] for x in range (n + 1)]

        for i in range (1, n + 1):
            floor[i][1] = 1
            floor[i][0] = 0

        for j in range (1, k + 1):
            floor[1][j] = j

        for i in range (2, n + 1): 
            for j in range (2, k + 1):
                floor[i][j] = 32767
                for x in range (1, j + 1):
                    res = 1 + max(floor[i - 1][x - 1], floor[i][j - x])
                    if res < floor[i][j]:
                        floor[i][j] = res

        val = (floor[n][k]);
        if val > 32:
            print("Impossible")
        else:
            print(floor[n][k])
    except:
        print("Impossible")
