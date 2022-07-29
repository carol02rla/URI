#include <stdio.h>
 
int main() {
    int qtdPalavras;
    char palavra[5];
    int i;
    
    scanf("%d", &qtdPalavras);
    
    for(i = 0; i < qtdPalavras; i++){
    scanf("%s", palavra);
    
    if((palavra[0] == 'o' && palavra[1] == 'n') || 
       (palavra[0] == 'o' && palavra[2] == 'e') || 
       (palavra[1] == 'n' && palavra[2] == 'e')){
      printf("1\n");
    }
    
    if((palavra[0] == 't' && palavra[1] == 'w') || 
       (palavra[0] == 't' && palavra[2] == 'o') || 
       (palavra[1] == 'w' && palavra[2] == 'o')){
      printf("2\n");
    }
    
    if(((palavra[0] == 't' && palavra[1] == 'h') && (palavra[2] == 'r' && palavra[3] == 'e')) || 
       ((palavra[0] == 't' && palavra[1] == 'h') && (palavra[2] == 'r' && palavra[4] == 'e')) || 
       ((palavra[0] == 't' && palavra[1] == 'h') && (palavra[3] == 'e' && palavra[4] == 'e')) ||
       ((palavra[0] == 't' && palavra[2] == 'r') && (palavra[3] == 'e' && palavra[4] == 'e')) ||
       ((palavra[1] == 'h' && palavra[2] == 'r') && (palavra[3] == 'e' && palavra[4] == 'e'))){
      printf("3\n");
    }
    }
 
    return 0;
}