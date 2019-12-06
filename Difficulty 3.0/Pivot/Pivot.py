n = int(input())

myList = []
sortedList = []
line = raw_input().split()

for i in line:
    val = int(i)
    myList.append(val)
    sortedList.append(val)

sortedList.sort()
counter = 0
leftHighest = -1000000

for i in myList:
    sortedList.remove(i)
    if len(sortedList) == 0:
        if (i >= leftHighest):
            counter += 1
    elif (i >= leftHighest):
        rightLowest = sortedList[0]
        if (i < rightLowest):
            counter += 1
        leftHighest = i

print(counter)
