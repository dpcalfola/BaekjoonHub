#include "stdio.h"

int main() {
    int n = 0;
    int fac_value = 1;
    register int i;
    scanf("%d", &n);

    for (i = n; i > 0; i--) {
        fac_value *= i;
    }
    printf("%d", fac_value);

    return 0;
}