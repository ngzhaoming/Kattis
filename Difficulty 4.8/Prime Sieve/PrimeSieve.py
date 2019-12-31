line = str(input()).split(" ")
n = int(line[0])
num = int(line[1])

prime = [True for i in range(n + 1)]
p = 2

while (p * p <= n):
    if (prime[p] == True):
        # The current number is a prime
        for i in range(p * p, n + 1, p):
            prime[i] = False
    p += 1

counter = 0
for p in range(2, n + 1):
    if prime[p]:
        counter += 1

print(counter)

for x in range(num):
    currNum = int(input())
    if prime[currNum] and currNum != 1:
        print(1)
    else:
        print(0)
