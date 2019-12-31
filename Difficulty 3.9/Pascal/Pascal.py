import math

def smallestDivisor(n):

    # if divisible by 2
    if (n % 2 == 0):
        return 2;

    # iterate from 3 to sqrt(n)
    i = 3;
    while(i * i <= n):
        if (n % i == 0):
            return i;
        i += 2;

    return n;

N = int(input())
highest = N - 1

if N == 1:
    print(highest)
else:
    if (N % 2 == 0):
        highest = highest / 2
    else:
        best = smallestDivisor(N)
        highest = N / best

    print(int(N - highest))

def transformCode(N):
    # Will result in a timeout
    counter = 0
    for x in range(N - 1, 1, -1):
        counter += 1
        if (N % x) == 0:
            break
    print(counter)
