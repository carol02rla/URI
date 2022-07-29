#include <stdio.h>
 
int main(void) {
    
    int func, horas;
    float valor;
    scanf("%d", &func);
    scanf("%d", &horas);
    scanf("%f", &valor);
    printf("NUMBER = %d\n", func);
    printf("SALARY = U$ %.2f\n", valor * horas);

    return 0;
}