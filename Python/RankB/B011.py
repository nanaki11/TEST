s = input().rstrip().split(' ')
n = int(s[0])
m = int(s[1])

quotient = (m - 1) // n
remainder = m  - n * quotient

if (quotient % 2 == 0):
    addition = 2 * (n - remainder )
    print(m + addition + 1 )
else:
    addition = 2*remainder 
    print(m - addition + 1 )