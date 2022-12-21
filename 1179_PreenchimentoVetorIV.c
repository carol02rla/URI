#include <stdio.h>

int main() {
    int par[5];
    int impar[5];
    int num;

    int p = 0, i = 0;

    for(int n = 0; n < 15; n++) {

        scanf("%d", &num);

        if(num%2 == 0) {
            par[p] = num;
            p++;

            if(p == 5) {
                for(int j = 0; j < 5; j++) {
                    printf("par[%d] = ", j);
                    printf("%d\n", par[j]);
                }
                p = 0;
            }
        } else {
            impar[i] = num;
            i++;

            if(i == 5) {
                for(int j = 0; j < 5; j++) {
                    printf("impar[%d] = ", j);
                    printf("%d\n", impar[j]);
                }
                i = 0;
            }
        }
    }

    for(int j = 0; j < i; j++) {
        printf("impar[%d] = ", j);
        printf("%d\n", impar[j]);
    }
    for(int j = 0; j < p; j++) {
        printf("par[%d] = ", j);
        printf("%d\n", par[j]);
    }

    return 0;
}