n = input()
arr = []
total = float(0.00)
grand_total = float(0.00)

for x in range(n):
    curr = float(input())
    total += float(curr * ((4.0/5.0)**x))
    arr.append(curr)

print(total / 5)
print(grand_total / 5 / float(n))
