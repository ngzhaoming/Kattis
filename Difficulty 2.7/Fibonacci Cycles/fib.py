x = int(input())

for i in range(x):
    mod = int(input())
    modList = {}

    prev = 1
    curr = 1
    idx = 2

    while True:
        total = prev + curr
        totalMod = total % mod

        if (totalMod in modList):
            print(modList[totalMod])
            break
        else:
            modList[totalMod] = idx;
            idx = idx + 1
            prev = curr
            curr = total

