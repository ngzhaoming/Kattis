import sys

l = 0
r = 0

for line in sys.stdin:
    arr = line.split(" ")
    l = int(arr[0])
    r = int(arr[1])

def f(x):
    iterations = 0
    while x != 1:
        if x % 2 == 0:
            x /= 2
        else:
            x += 1
        iterations += 1
    return iterations

def result(l, r):
    if l == r:
        return f(l)

    # Function f will just return 0
    if l == 1:
        return result(l + 1, r)

    if l % 2 == 0:
        return result(l + 1, r) + f(l)

    if r % 2 == 1:
        return result(l, r - 1) + f(r)

    return 2 * result((l + 1) / 2, r / 2) + 3 * (r - l + 1) / 2

ans = result(l, r)

# Cannot use math library since it cannot tabulate math.pow(10, 9)
print(int(ans % (10**9 + 7)))
