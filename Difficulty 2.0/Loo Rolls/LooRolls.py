import math

inpt = input().split(" ")
length = int(inpt[0])
used = int(inpt[1])

needed = int(inpt[1])
left = 0
rolls = 1
calc = int(inpt[1])

while (length % needed != 0):
    left = (length % needed)
    needed -= left
    rolls += 1

print(rolls)
