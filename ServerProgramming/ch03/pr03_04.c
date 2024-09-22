#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <math.h>

void help() {
    printf("./pr03_04.out [option] int m int n\n");
}

int gcd(int m, int n) {
    while (n != 0) {
        int temp = n;
        n = m % n;
        m = temp;
    }
    return m;
}

int lcm(int m, int n) {
    return m * n / gcd(m, n);
}

int main(int argc, char *argv[]) {
    int n;
    extern char *optarg;
    extern int optind;

    if (argc != 1) {
        while ((n = getopt(argc, argv, "g:n:t:p:")) != -1) {
            switch (n) {
                case 'g':
                    printf("%d\n", gcd(atoi(argv[2]), atoi(argv[3])));
                    break;
                case 'n':
                    printf("%d\n", lcm(atoi(argv[2]), atoi(argv[3])));
                    break;
                case 't':
                    printf("%d\n", atoi(argv[2]) * atoi(argv[3]));
                    break;
                case 'p':
                    printf("%d\n", atoi(argv[2]) + atoi(argv[3]));
                    break;
                case '?':
                    help();
                    break;
                case ':':
                    help();
                    break;
                default:
                    help();
                    break;
            }
        }
    }
}

