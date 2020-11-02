import math 
  
def primeFactors(n): 
    counter = 0

    while n % 2 == 0: 
        counter = counter + 1
        n = n / 2
          
    for i in range(3,int(math.sqrt(n))+1,2): 
        while n % i== 0: 
            counter = counter + 1
            n = n / i 
              
    if n > 2: 
        # This means that the end result is a prime
        counter = counter + 1

    return counter
  
n = int(input()) 
print(primeFactors(n)) 
