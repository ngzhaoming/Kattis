animals = []
n = int(input())
for i in range(n):
    animals.append(raw_input())

animals.reverse()

counter = 0
total = 0
for curr in animals:
    if curr == "O":
        total += 2 ** (counter)
    counter += 1

print(int(total))
