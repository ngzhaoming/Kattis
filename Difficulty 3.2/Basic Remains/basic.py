def numberToBase(n, b):
    if n == 0:
        return [0]
    digits = []
    while n:
        digits.append(int(n % b))
        n //= b
    return digits[::-1]

while True:
    arr = input().split(" ")
    base = int(arr[0])

    if base == 0:
        break

    p = int(arr[1], base)
    m = int(arr[2], base)

    result = p % m
    ans = numberToBase(result, base)

    for x in ans:
        print(x, end = "")

    print()
