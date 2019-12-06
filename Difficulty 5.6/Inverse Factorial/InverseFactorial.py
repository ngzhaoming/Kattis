import math

fac = input()
length = len(fac)

def findDigits(n):
    if (n < 0):
        return 0;

    if (n <= 1):
        return 1;

    x = ((n * math.log10(n / math.e) +
              math.log10(2 * math.pi * n) /2.0));

    return math.floor(x) + 1;

if length == 1 or length == 3:
    counter = 2
    total = 1
    while total != int(fac):
        total *= counter
        counter += 1
    print(counter - 1)

else:
    counter = 2
    total = 0;
    while total != length:
        total = findDigits(counter)
        counter += 1
    print(counter - 1)


