#include <stdio.h>
 
int main() {
    int numero;
    int N;
    int i, j;
    
    scanf("%d", &N);
    
    for(i = 0; i < N; i++){
        int div = 0;
        scanf("%d", &numero);
        for(j = 1; j <= numero; j++){
          if((numero % j) == 0){
            div++;
          }
        }
        if(div <= 2){
          printf("%d eh primo\n", numero);
        } else printf("%d nao eh primo\n", numero);
    }
 
    return 0;
}