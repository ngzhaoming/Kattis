import sys

grid = []
inst = ""
data = sys.stdin.read().splitlines()
counter = 0

# Creating the 2D array
for x in data:
    if counter != 8:
        grid.append([])
        for char in x:
            grid[counter].append(char)
        counter += 1
    else:
        inst = x

face = "right"
currX = 7
currY = 0
prevTile = "."
nextX = 0
nextY = 0

verdict = True

for x in inst:
    if x == 'L':
        if face == "up":
            face = "left"
        elif face == "left":
            face = "down"
        elif face == "down":
            face = "right"
        else:
            face = "up"
    elif x == 'R':
        if face == "up":
            face = "right"
        elif face == "left":
            face = "up"
        elif face == "down":
            face = "left"
        else:
            face = "down"
    elif x == 'F':
        if face == "up":
            nextX = currX - 1
            nextY = currY
        elif face == "left":
            nextX = currX
            nextY = currY - 1
        elif face == "down":
            nextX = currX + 1
            nextY = currY
        else:
            nextX = currX
            nextY = currY + 1

        if nextX >= 0 and nextY >= 0 and nextX < len(grid) and nextY < len(grid[0]):
            # This is a valid position
            currChar = grid[nextX][nextY]
            if currChar == 'D' or currChar == '.':
                prevTile = currChar
                currX = nextX
                currY = nextY
            else:
                verdict = False
                break
        else:
            verdict = False
            break
    else:
        # This is shooting
        if face == "up":
            nextX = currX - 1
            nextY = currY
        elif face == "left":
            nextX = currX
            nextY = currY - 1
        elif face == "down":
            nextX = currX + 1
            nextY = currY
        else:
            nextX = currX
            nextY = currY + 1

        if nextX >= 0 and nextY >= 0 and nextX < len(grid) and nextY < len(grid[0]):
            # This is a valid position
            currChar = grid[nextX][nextY]
            if currChar == 'I':
                grid[nextX][nextY] = "."
            else:
                verdict = False
                break
        else:
            verdict = False
            break
        
if verdict:
    # Check whether it is on diamond
    if prevTile == "D":
        print("Diamond!")
    else:
        print("Bug!")
else:
    print("Bug!")
