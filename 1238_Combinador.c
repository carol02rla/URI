#include <stdio.h>
#include <string.h>

int main(void) {
  char string1[50], string2[50];
  int N, i, j, maior;
  int tam1, tam2;

  scanf("%d", &N);

  for(i = 0; i < N; i++){
    scanf("%s %s", string1, string2);

    tam1 = strlen(string1);
    tam2 = strlen(string2);

    if(tam1 < tam2){
      maior = tam2;
    } else maior = tam1;

    for(j = 0; j < maior; j++){
      if(j < tam1){
        printf("%c", string1[j]);
      }
      if(j < tam2){
        printf("%c", string2[j]);
      }
    }
    printf("\n");
  }
  
  return 0;
}