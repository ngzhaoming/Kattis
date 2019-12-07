import collections

def dequeCreation(num):
    de = collections.deque()
    if num != 0:
        if num == 1:
            de.append(int(elements[0][1:len(elements[0]) - 1]))
        else:
            for y in range(num):
                if y == 0:
                    de.append(int(elements[y][1:]))
                elif y == num - 1:
                    de.append(int(elements[y][:len(elements[y]) - 1]))
                else:
                    de.append(int(elements[y]))
    return de



n = int(input())

for x in range(n):
    inpt = input()
    num = int(input())
    elements = input().split(",") 

    de = dequeCreation(num)
    isReverse = False
    verdict = True

    for curr in inpt:
        if curr == 'R':
            isReverse = not isReverse
        else:
            if num == 0:
                verdict = False
                break

            if isReverse:
                de.pop()
            else:
                de.popleft()
            num -= 1

    if verdict:
        if isReverse:
            revDe = de.reverse()
            result = list(de)
            print(str(result).replace(" ", ""))
        else:
            print(str(list(de)).replace(" ", ""))
    else:
        print("error")
