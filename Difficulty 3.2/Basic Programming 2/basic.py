first = input().split(" ")
action = int(first[1])

second = input().split(" ") 
for i in range(len(second)):
    second[i] = int(second[i])

second.sort()

if action == 1:
    flag = False
    for i in range(len(second)):
        lead = second[i]
        for j in range(i + 1, len(second)):
            total = lead + second[j]
            if (total == 7777):
                flag = True
                break
            elif (total > 7777):
                break
        if flag:
            break
    
    if flag:
        print("Yes")
    else:
        print("No")

if action == 2:
    if (len(set(second)) == len(second)):
        print("Unique")
    else:
        print("Contains duplicate")

if action == 3:
    store = {}
    for i in second:
        if i in store:
            store[i] = (store[i] + 1)
        else:
            store[i] = 1
        
    ans = -1
    threshold = int(len(second) / 2)
    for x in store: #Getting all the keys
        amt = store[x]
        if amt > threshold:
            ans = x
            break

    print(ans)

if action == 4:
    if len(second) % 2 == 0:
        index = int(len(second) / 2)
        print(str(second[index - 1]) + " " + str(second[index]))
    else:
        index = int(len(second) / 2)
        print(second[index])

if action == 5:
    final = []
    for x in second:
        if x >= 100 and x <= 999:
            final.append(x)
        
        if x > 999:
            break

    for i in range(len(final)):
        if i < len(final) - 1:
            print(final[i], end = " ")
        else:
            print(final[i])

