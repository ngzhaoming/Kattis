import operator as op
from functools import reduce

def ncr(n, r):
    r = min(r, n-r)
    numer = reduce(op.mul, range(n, n-r, -1), 1)
    denom = reduce(op.mul, range(1, r+1), 1)
    return numer // denom

x = input()
x = x.split()

total = 1
for i in x:
    val = int(i)
    total *= ncr(val, 1)

    
print(total)
