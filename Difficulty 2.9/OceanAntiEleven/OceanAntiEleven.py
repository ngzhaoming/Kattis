test = int(input())

value = 1;
previous = 1;
temp = 0;

for x in range(test):
    num = int(input());
    for y in range(num):
        temp = value;
        value += previous;
        previous = temp;
    print(value % (1000000000 + 7))
    value = 1;
    previous = 1;
