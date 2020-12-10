import sys

x = input()

for string in sys.stdin:
    string = string[:-1]
    idx = len(string) 

    for i in range(1, len(string)):
        line = string[0:i] * len(string)
        line = line[:len(string)]

        if line == string:
            idx = i
            break

    print(idx)
