#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

extern int addnums(int *nums, int n);

int main(int argc, char *argv[]) {
    if (argc != 3) {
        return 1;
    }

    int n = atoi(argv[1]);
    int number2 = atoi(argv[2]);

    int *arr = (int *)malloc(n * sizeof(int));
    if (arr == NULL) {
        return 1;
    }


    for (int i = 0; i < n; i++) {
        arr[i] = i + 1;
    }

    int result1 = addnums(arr, n);


    arr = (int *)realloc(arr, (n + number2) * sizeof(int));
    if (arr == NULL) {
        return 1;
    }


    for (int j = 0; j < number2; j++) {
        arr[n + j] = n + 1 + j;
    }


    int result2 = addnums(arr + n, number2);


    free(arr);


    printf("%d %d\n", result1, result2);

    return 0;
}

