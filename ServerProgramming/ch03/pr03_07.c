#include <stdio.h>
#include <stdlib.h>

int main() {
    int size = 5;
    int *array = calloc(size, sizeof(int));
    int *ptr = array;

    for (int i = 0; i < size; ++i) {
        ptr[i] = rand() % 10;
    }

    for (int i = 0; i < size; ++i) {
        printf("%d\n", ptr[i]);
    }

    printf("The first value: %d\n", ptr[0]);

    free(array);
    return 0;
}

