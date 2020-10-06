arr = input().split()
n = int(arr[0])
spaceship = int(arr[1])

spaceStr = input().split()
map_object = map(int, spaceStr)
finniList = list(map_object)
finniList.sort()

total = 0;
for i in finniList:
    if (i + 1) <= spaceship:
        spaceship = spaceship - (i + 1)
        total = total + 1
    else:
        break

print(total)
