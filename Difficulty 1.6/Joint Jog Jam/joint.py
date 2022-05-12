import math

a = list(map(int, input().strip().split()))

ans = 0

first = math.sqrt(pow(a[0] - a[2], 2) + pow(a[1] - a[3], 2))
second = math.sqrt(pow(a[4] - a[6], 2) + pow(a[5] - a[7], 2))

result = max(first, second)
print(result)
