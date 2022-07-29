#include <stdio.h>
 
int main() {
 
    double A, B, C, areaTR, areaC, areaTr, areaQ, areaR, pi;
    
    scanf("%lf %lf %lf", &A, &B, &C);
    
    pi = 3.14159;
    
    areaTR = (A * C) / 2;
    areaC = pi * (C * C);
    areaTr = ((A + B) * C) / 2;
    areaQ = B * B;
    areaR = A * B;
    
    printf("TRIANGULO: %.3lf\n", areaTR);
    printf("CIRCULO: %.3lf\n", areaC);
    printf("TRAPEZIO: %.3lf\n", areaTr);
    printf("QUADRADO: %.3lf\n", areaQ);
    printf("RETANGULO: %.3lf\n", areaR);
 
    return 0;
}