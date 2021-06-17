import sys

x = int(input())
write = str(input())

for i in range(1, x + 1):
    substring = str(i)

    verdict = write.startswith(substring)

    if not verdict:
        print(i)
        break
    else:
        write = write.replace(substring, "", 1)
