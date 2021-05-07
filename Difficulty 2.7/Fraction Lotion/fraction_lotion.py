from sys import stdin

for line in stdin:
    originalDenom = float(line[2:])
    xDenom = originalDenom + 1
    unique = 0

    while True:
        numDiff = xDenom - originalDenom
        totalDenom = xDenom * originalDenom

        if (numDiff > originalDenom):
            break

        if (totalDenom % numDiff == 0):
            unique = unique + 1

        xDenom = xDenom + 1


    print(unique)
