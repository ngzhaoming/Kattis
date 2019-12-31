counter = 0

def isDraw(onePlay, twoPlay):
    if onePlay == twoPlay:
        return True
    return False

def isWin(onePlay, twoPlay):
    if onePlay == "rock" and twoPlay == "scissors":
        return True
    elif onePlay == "scissors" and twoPlay == "paper":
        return True
    elif onePlay == "paper" and twoPlay == "rock":
        return True
    else:
        return False

while True:
    line = input().split(" ")
    players = int(line[0])
    if players == 0:
        break

    if counter != 0:
        print()

    wins = []
    loses = []

    for x in range(players + 1):
        wins.append(0)
        loses.append(0)

    games = int(int(line[1]) * players * (players - 1) / 2)

    for x in range(games):
        line = input().split(" ")
        one = int(line[0])
        onePlay = line[1]
        two = int(line[2])
        twoPlay = line[3]

        if isDraw(onePlay, twoPlay):
            pass
        elif isWin(onePlay, twoPlay):
            wins[one] += 1
            loses[two] += 1
        else:
            loses[one] += 1
            wins[two] += 1

    for x in range(1, len(wins)):
        winner = wins[x]
        loser = loses[x]

        if winner + loser == 0:
            print("-")
        else:
            print("{0:.3f}".format((winner / (winner + loser))))
    
    counter += 1