s = set()

n = int(input())
strinpt = str(input())
strarr = strinpt.split(" ")

for i in range(0, n):
    s.add(int(strarr[i]))

know = str(input()).split(" ")

for i in range(0, n - 1):
    s.remove(int(know[i]))

for i in s:
    print(i)
