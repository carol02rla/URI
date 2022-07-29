#include <stdio.h>
 
int main() {
    int coluna;
    char operacao;
    float matriz[12][12];
    float resultado = 0;
    int i, j;
    
    scanf("%d", &coluna);
    scanf(" %c", &operacao);
    
    for(i = 0; i < 12; i++){
        for(j = 0; j < 12; j++){
            scanf("%f", &matriz[i][j]);
        }
    }
    
    for(i = 0; i < 12; i++){
        resultado += matriz[i][coluna];
    }
    
    if(operacao == 'S'){
        printf("%.1f\n", resultado);
    } else if (operacao == 'M') {
        printf("%.1f\n", resultado/12);
    }
 
    return 0;
}