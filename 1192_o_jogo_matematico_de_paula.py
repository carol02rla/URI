N = int(input())

for i in range(N):
    cod = input()

    n1 = int(cod[0])
    n2 = int(cod[2])

    if n1 == n2:
        print(n1*n2)
    elif cod[1].isupper():
        print(n2-n1)
    elif not cod[1].isupper():
        print(n1+n2)