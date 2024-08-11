N = int(input())

for i in range(N):
    qtd_tiros = int(input())
    altura_tiros = input()
    alt_tiros = []
    seq_pulos = input()
    cont = 0

    alt_tiros = altura_tiros.split(" ")
    pulos = list(seq_pulos)

    for j in range(qtd_tiros):
        if pulos[j] == 'J' and int(alt_tiros[j]) > 2:
            cont += 1
        elif pulos[j] == 'S' and int(alt_tiros[j]) <= 2:
            cont += 1
    
    print(cont)