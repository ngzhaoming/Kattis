from datetime import datetime
import sys
import time

curr = str(input())
final = str(input())

if (curr == final):
    print("24:00:00")
else:
    FMT = '%H:%M:%S'
    tdelta = datetime.strptime(final, FMT) - datetime.strptime(curr, FMT)

    result = time.strftime('%H:%M:%S', time.gmtime(tdelta.seconds))

    print(result)
