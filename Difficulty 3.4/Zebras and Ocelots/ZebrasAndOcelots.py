n = int(input())
total = 0
for i in range(n):
    if (raw_input() == "O"):
        total += 2**(n - i -1)

print(int(total))
