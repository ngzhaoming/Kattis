stack = []
val = str(input())

for x in val:
    if x == '<':
        stack.pop()
    else:
        stack.append(x)

for x in stack:
    print(x, end = "")

print()
