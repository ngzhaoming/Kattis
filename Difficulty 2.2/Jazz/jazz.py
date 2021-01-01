import math

def check_complete(nm, i):
    flag = True
    for num in range(2, i + 1):
        square = num ** 2

        if nm % square == 0:
            flag = False
            break

    return flag

n = int(input())

for i in range(2, n):
    nm = n * i

    if check_complete(nm, i):
        print(i)
        break
