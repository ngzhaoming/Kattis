import math

line = input().split(" ")

p = int(line[0])
a = int(line[1])
b = int(line[2])
c = int(line[3])
d = int(line[4])
n = int(line[5])

result = p * (math.sin(a * n + b) + math.cos(c * n + d) + 2)
absBig = 0

for x in range(n - 1, 0, -1):
    calc = p * (math.sin(a * x + b) + math.cos(c * x + d) + 2)
    if calc < result:
        result = calc
    else:
        diff = calc - result
        if diff > absBig:
            absBig = diff

print(absBig)
