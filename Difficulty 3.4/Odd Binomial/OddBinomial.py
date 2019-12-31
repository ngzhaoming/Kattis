inpt = int(input())
mem = {}

def formula(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        result = mem.get(n)
        # Check the global dictionary first
        if result == None:
            if n % 2 == 0:
                result = 3 * formula(n / 2)
                mem[n] = result
            else:
                result = 2 * formula((n - 1) / 2) + formula((n - 1) / 2 + 1)
        return result
            
print(formula(inpt))
# a(0) = 0, a(1) = 1, a(2k) = 3*a(k), a(2k+1) = 2*a(k) + a(k+1)
