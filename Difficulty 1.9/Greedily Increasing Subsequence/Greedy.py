n = int(input())
line = input().split()
highest = -1000
total =  0
result = ""
for i in range(n):
    currVal = int(line[i])
    if (currVal > highest):
        result += str(currVal) + " "
        highest = currVal
        total += 1
print(total)
print(result[0:len(result) - 1])
