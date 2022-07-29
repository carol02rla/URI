#include <stdio.h>
 
int main() {
    int qtdGrenais = 0;
    int vitoriasGremio = 0, vitoriasInter = 0, empates = 0;
    int I, G;
    int opcao;
    
    do {
    qtdGrenais++;
    
    scanf("%d %d", &I, &G);
    
    if(I > G){
      vitoriasInter++;
    } else if (G > I) {
      vitoriasGremio++;
    } else empates++;
    
    printf("Novo grenal (1-sim 2-nao)\n");
    scanf("%d", &opcao);
    } while (opcao == 1);
    
    printf("%d grenais\n", qtdGrenais);
    printf("Inter:%d\n", vitoriasInter);
    printf("Gremio:%d\n", vitoriasGremio);
    printf("Empates:%d\n", empates);
    if(vitoriasInter > vitoriasGremio){
    printf("Inter venceu mais\n");
    } else if (vitoriasInter < vitoriasGremio) {
    printf("Gremio venceu mais\n");
    } else printf("Nao houve vencedor\n");
 
    return 0;
}