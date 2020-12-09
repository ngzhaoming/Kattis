from math import log2

bits_table = {}
high_table = {}

total = 0
counter = 2

for i in range(1960, 2170, 10):
    steps = (int((i - 1940) / 10))
    bits_table[i] = 2**steps

    while True:
        total = total + log2(counter)
        counter = counter + 1

        if total > bits_table[i]:
            high_table[i] = counter - 2
            break

while True:
    x = int(input())
    if x == 0:
        break

    actual = int(x / 10) * 10

    print(high_table[actual])
