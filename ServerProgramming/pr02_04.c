#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>  


void available_options() {
    printf("Available Options:\n");
    printf("[p  Welcome to Linux Server Programming!]\n");
    printf("[n  Nice to meet you, ???]\n");
    printf("[h  Help!]\n");
}

int main(int argc, char *argv[]) {
    int opt;
    char *name = NULL;

    if(argc == 1){
        available_options();
        return 0;}

    while ((opt = getopt(argc, argv, "pn:h")) != -1) {
        switch (opt) {
            case 'p':
                printf("Welcome to Linux Server Programming!\n");
                break;
            case 'n':
                if (optarg) {
                    name = optarg;
                    printf("Nice to meet you, %s!\n", name);
                } else {
                   fprintf(stderr, "Option requires an argument -- 'n'\n");
                }
                break;
            case 'h':
                available_options();
                break;
        }
    }

    return 0;
}

