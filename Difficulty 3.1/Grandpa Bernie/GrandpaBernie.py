n = int(input())
memories = {}
for i in range(0, n):
    line = input().split()
    country = line[0]
    year = int(line[1])
    if country not in memories:
        memories[country] = []
    memories[country].append(year)
for _,val in memories.items(): #To sort out all the list
    val.sort()
k = int(input())
for k in range(0, k):
    question = input().split()
    asked = question[0]
    number = int(question[1])
    print(memories[asked][number-1])
