#include <stdio.h>

int main() {
    int input_a;
    scanf("%d", &input_a);

    if (input_a >= 90) {
        printf("A");
    } else if (input_a >= 80) {
        printf("B");
    } else if (input_a >= 70) {
        printf("C");
    } else if (input_a >= 60) {
        printf("D");
    } else {
        printf("F");
    }
    return 0;
}