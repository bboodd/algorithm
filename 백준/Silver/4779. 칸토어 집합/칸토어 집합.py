def cantoa(line):
    if len(line) == 1:
        return line
    else:
        first = cantoa("-"*(len(line)//3))
        mid = " "*(len(line)//3)
        last = cantoa("-"*(len(line)//3))

        return first + mid + last

while True:
    try:
        n = int(input())
        line = "-"*(3**n)
        print(cantoa(line))
    except:
        break