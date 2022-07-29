#include <stdio.h>
 
int main() {
    int T, i, j = 0;
    int N[1000];
    
    scanf("%d", &T);
    
    for(i = 0; i < 1000; i++){
    N[i] = j;
    j++;
    if(j == T){
      j = 0;
    }
    }
    
    for(i = 0; i < 1000; i++){
    printf("N[%d] = %d\n", i, N[i]);
    }
 
    return 0;
}