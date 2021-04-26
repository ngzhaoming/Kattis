given = set() 

word = str(input())
firstLetter = word[0]

for elem in word:
    given.add(elem)

N = int(input())

for i in range(N):
    currWord = str(input())
    dictSet = set()

    for elem in currWord:
        dictSet.add(elem)

    isSubset = dictSet.issubset(given)
    length = len(currWord)
    isUsing = firstLetter in dictSet

    if isSubset and length >= 4 and isUsing:
        print(currWord)
