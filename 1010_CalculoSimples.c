#include <stdio.h>
 
int main() {
 
    int codigo1, numpcs1, codigo2, numpcs2;
    float valorpcs1, valorpcs2, total;
    
    scanf("%d %d %f", &codigo1, &numpcs1, &valorpcs1);
    scanf("%d %d %f", &codigo2, &numpcs2, &valorpcs2);
    
    total = (numpcs1 * valorpcs1) + (numpcs2 * valorpcs2);
    
    printf("VALOR A PAGAR: R$ %.2f\n", total);
 
    return 0;
}