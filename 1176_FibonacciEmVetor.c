#include <stdio.h>

int main() {
  int T;
  int N;
  int i, j;
  unsigned long long int seqFibonacci[61];

  scanf("%d", &T);

  for(i = 0; i < T; i++){
    scanf("%d", &N);

    seqFibonacci[0] = 0;
    seqFibonacci[1] = 1;

    if(N > 1){
      for(j = 2; j <= N; j++){
        seqFibonacci[j] = seqFibonacci[j-1] + seqFibonacci[j-2];
      }
    }

    printf("Fib(%d) = %llu\n", N, seqFibonacci[N]);
  }

  return 0;
}