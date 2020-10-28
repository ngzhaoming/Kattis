inputs = input().split(" ")
n = int(inputs[0])
k = int(inputs[1])

if k > 350:
    print("Your wish is granted!")
else:
    # k <= 350
    chungus = 2 ** k
    if chungus >= n:
        print("Your wish is granted!")
    else:
        print("You will become a flying monkey!")
