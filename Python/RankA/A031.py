input = input().rstrip().split(' ')
iInput=[int(s) for s in input]
a = iInput[3]
list =[]

for i in range(23):
    for j in range(23):
        for k in range(23):
         data =   (iInput[0]**k)*(iInput[1]**j)*(iInput[2]**i)
         if data > 2**63:
             continue
         list.append(data)

list.sort()
print(list[a-1])