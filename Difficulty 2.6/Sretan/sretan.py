def result_length(given):
    counter = 1
    while (given > 2**counter - 2):
        counter += 1

    return counter - 1
    
x = int(input())

x_len = result_length(x)

start = 2 ** x_len - 1

diff = str("{0:b}".format(x - start))

while (len(diff) < x_len):
    diff = "0" + diff

result = ""

for i in diff:
    if (i == '0'):
        result += "4"
    else:
        result += "7"

print(result)
