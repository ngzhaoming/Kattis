from sys import stdin
import math

def findDigits(n):
    if n <= 1:
        return 1

    result = ((n * math.log10(n / math.e) + 
        math.log10(2 * math.pi * n) / 2.0))

    return math.floor(result) + 1

while True:
    try:
        n = int(input())
        print(findDigits(n))
    except EOFError:
        break

