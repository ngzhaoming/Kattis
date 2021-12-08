l = []

n = int(input())

for i in range(0, n):
    curr = str(input()).split(" ")
    l.append((int(curr[0]), int(curr[1])))

l.sort(reverse=True)

count = 1;
threshold = l[0][0]

for i in range(1, len(l)):
    if (l[i][1] <= threshold):
        threshold = l[i][0]
        count += 1

print(count)
