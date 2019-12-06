n = int(input())
temp = n
factors = []
factors.append(0)
factors.append(n - 1)

i = 2
while (i < temp):
    if (n % i == 0):
        val = (i - 1)
        val1 = (n / i - 1)
        if (val != val1):
            factors.append(val1)
        factors.append(val)
        temp = (n / i)
    i += 1

factors.sort()

result = ""
for j in factors:
    result = result + str(j) + " "

print(result[0:len(result) - 1])
