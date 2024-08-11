K = int(input())

while K != 0:
    N, M = input().split(" ")
    N, M = int(N), int(M)

    for i in range(K):
        X, Y = input().split(" ")
        X, Y = int(X), int(Y)

        if X == N or Y == M:
            print("divisa")
        elif X < N and Y > M:
            print("NO")
        elif X > N and Y > M:
            print("NE")
        elif X > N and Y < M:
            print("SE")
        elif X < N and Y < M:
            print("SO")

    K = int(input())