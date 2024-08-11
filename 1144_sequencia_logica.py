N = int(input())

n1, n2, n3 = 0, 0, 0
cont3 = 0

for i in range(0, N*2):
    n2 += 1
    n3 += 1

    if (i%2 == 0):
        n1 += 1
        if i != 0: n2 += i-1
        cont3 += 1
        n3 = n2*cont3

    print(n1, n2, n3)