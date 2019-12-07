import sys

for line in sys.stdin:
    n = int(line)
    currNum = 1 % n
    result = 1
    while(currNum != 0):
        currNum = (currNum * 10 + 1) % n
        result += 1
    print(result)
