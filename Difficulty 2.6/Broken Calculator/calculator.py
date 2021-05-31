n = int(input())

prev = 1

for i in range(n):
    currStr = input().split(" ") 
    answer = 0
    
    if (currStr[1] == "+"):
        answer = (int(currStr[0]) + int(currStr[2])) - prev

    elif (currStr[1] == "-"):
        answer = (int(currStr[0]) - int(currStr[2])) * prev

    elif (currStr[1] == "*"):
        answer = (int(currStr[0]) * int(currStr[2])) * (int(currStr[0]) * int(currStr[2]))

    elif (currStr[1] == "/"):
        if (int(currStr[0]) % 2 == 0) :
            answer = int(currStr[0]) / 2
        else:
            answer = (int(currStr[0]) + 1) / 2

    print(int(answer))
    prev = int(answer)