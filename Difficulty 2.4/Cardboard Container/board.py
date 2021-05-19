import math

n = int(input())

factors = []

counter = 1

while (counter ** 2 <= n):
    if (n % counter == 0):
        factors.append(counter)

        if (counter ** 2 != n): 
            factors.append(int(n / counter))

    counter = counter + 1

factors.sort()

minimum = math.inf

for i in factors:
    length = i
    remainder = n / i

    for j in factors:
        if (remainder % j != 0): continue
        width = remainder / j
        height = j
        minimum = min(minimum, 2 * (length * width + width * height + height * length))

print(int(minimum))
