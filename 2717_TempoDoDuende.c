#include <stdio.h>
 
int main() {
 
    int N, A, B;

    scanf("%d", &N);
    scanf("%d %d", &A, &B);

    if(A + B > N){
        printf("Deixa para amanha!\n");
    } else if (A + B <= N) {
        printf("Farei hoje!\n");
    }
 
    return 0;
}