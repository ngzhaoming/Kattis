n = int(raw_input())

total = n

while (n != 1):
    if (n % 2 == 0):
        n /= 2
    else:
        n = 3 * n + 1

    total += n


print(int(total))
