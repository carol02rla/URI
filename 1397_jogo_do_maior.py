N = int(input())

while N > 0:
    contA = 0
    contB = 0

    for i in range(N):
        A, B = input().split(" ")
        A, B = int(A), int(B)
        
        if A >= 0 and A <= 10 and B >= 0 and B <= 10:
            if A > B:
                contA += 1
            elif B > A:
                contB += 1

    print(contA, contB) 
    N = int(input())