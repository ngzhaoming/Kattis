string = input()

result = ""
cursor = 0
for x in string:
    if x.isupper():
        if x == 'L':
            cursor = cursor - 1
        elif x == 'R':
            cursor = cursor + 1
        else:
            first = result[:cursor - 1]
            second = result[cursor:]
            result = first + second
            cursor = cursor - 1 
    else:
        first = result[:cursor]
        second = result[cursor:]
        result = first + x + second

        cursor = cursor + 1

print(result)
