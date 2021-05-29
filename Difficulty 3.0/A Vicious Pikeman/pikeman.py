arr1 = input().split(" ")
arr2 = input().split(" ")

a = int(arr2[0])
b = int(arr2[1])
c = int(arr2[2])
t0 = int(arr2[3])

timings = [t0]

n = int(arr1[0])
t = int(arr1[1])

for i in range(1, n):
    diff = ((a * timings[i - 1] + b) % c) + 1
    timings.append(diff)

timings = sorted(timings)

total_timing = 0
penalty = 0
total = 0

for i in timings:
    if total_timing + i > t:
        break
    total += 1
    total_timing += i
    penalty = (penalty + total_timing) % 1000000007

print(str(total) + " " + str(penalty))