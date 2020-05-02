a = input().rstrip().split(' ')
w = int(a[0])
h = int(a[1])
n = int(a[2])

b = input().rstrip().split(' ')
initW = int(b[0])
initH = int(b[1])

for i in range(n):
    c = input().rstrip().split(' ')
    direction = c[0]
    num = int(c[1])
    if("U"==direction):
        initH = (initH + num) % h
    elif("D"==direction):
        initH = (initH - num) % h
    elif("L"==direction):
        initW = (initW -num) % w
    elif("R"==direction):
        initW = (initW + num) % w

print(initW,initH)