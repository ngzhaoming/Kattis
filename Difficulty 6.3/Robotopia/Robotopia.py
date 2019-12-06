n = int(input())

for x in range(n):
    arr = input().split(" ")
    oneL = int(arr[0])
    oneA = int(arr[1])
    twoL = int(arr[2])
    twoA = int(arr[3])
    totalL = int(arr[4])
    totalA = int(arr[5])

    counter = 1
    solved = 0
    ones = 0
    twos = 0

    while (counter <= int(totalL / oneL) and solved < 2):
        cal = (totalL - (counter * oneL)) % twoL
        if cal == 0:
            currTwo = (totalL - (counter * oneL)) / twoL
            if (totalA - counter * oneA - currTwo * twoA == 0 and currTwo >=1):
                ones = counter
                twos = currTwo
                solved += 1
        counter += 1

    if solved != 1:
        print("?")
    else:
        print(str(ones) + " " + str(int(twos)))
