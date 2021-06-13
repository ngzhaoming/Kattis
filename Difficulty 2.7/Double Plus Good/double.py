import sys

x = list(map(int, str(input()).split('+')))

result = set()

def recursive_add(counter, val):
    if (counter >= len(x)): # Base case 
        total = 0

        for i in val:
            total = total + i

        result.add(total)
    else:
        curr_val = x[counter]
        val_last = val[len(val) - 1]

        #arithmetic arr
        arith_arr = val.copy()
        arith_arr.append(curr_val)

        #concat arr
        temp = val.copy()
        new_arr = temp[:-1]
        new_val = str(val_last) + str(curr_val)
        new_arr.append(int(new_val))

        recursive_add(counter + 1, arith_arr) #This is arithmetic plus
        recursive_add(counter + 1, new_arr) #This is concat plus
    
recursive_add(1, [x[0]])

print(len(result))
