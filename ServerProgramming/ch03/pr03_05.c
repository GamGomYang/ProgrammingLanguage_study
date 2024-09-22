#include <stdio.h>
#include <stdlib.h>

int count_vowel(char *str) {
    int count = 0;
    for (int i = 0; str[i] != '\0'; i++) {
               if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' ||
            str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U') {
            count++;
        }
    }
    return count;
}

int main() {
    int n;
    printf(">> ");
    scanf("%d", &n);

    char **strings = calloc(n, sizeof(char *));
    for (int i = 0; i < n; ++i) {
        strings[i] = calloc(20, sizeof(char));
        scanf("%s", strings[i]);
    }

    int total_vowels = 0; 
    for (int i = 0; i < n; ++i) {
        total_vowels += count_vowel(strings[i]);  
        free(strings[i]);
    }
    free(strings);

    printf(">> %d\n", total_vowels);  
    return 0;
}

