n = int(input())
citations = {}
for k in range(n):
    cit = int(input()) # Number of citation for that reading
    if cit in citations:
        citations[cit] += 1
    else:
        citations[cit] = 1
total = n
maximum = 0
for m in range(n + 1):
    if total < m:
        break
    else:
        if m in citations:
            total -= citations[m]
        maximum = m
print(maximum)
