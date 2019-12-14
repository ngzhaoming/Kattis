test = int(input())

# Settling each test case
for x in range(test):
    people = int(input())
    arrList = []

    # Adding all the people into the list
    for y in range(people):
        line = input().split(" ")
        logs = int(line[0])
        total = 0
        
        # Counting the total of logs for each person
        for z in range(1, logs + 1):
            total += int(line[z])
        arrList.append(total)

    arrList.sort()

    result = 0

    for num in arrList:
        result *= 2
        result += num

    print(str(result / people))
