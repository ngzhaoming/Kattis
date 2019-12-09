import math

line = input().split(" ")

m = int(line[0])
n = int(line[1])
t = int(line[2])

result = True 

if (t == 1):
    #Since largest m range in 10**9, 15! will definitely exceed
    if n > 15:
        result = False
    else:
        result = 1
        for i in range(1, n + 1):
            result *= i
        result = result <= m
elif (t == 2):
    result = 2**n <= m
elif (t == 3):
    result = n**4 <= m
elif (t == 4):
    result = n**3 <= m
elif (t == 5):
    result = n**2 <= m
elif (t == 6):
    result = n * math.log2(n) <= m
elif (t == 7):
    result = n <= m
else:
    result = False

if (result):
    print("AC")
else:
    print("TLE")
