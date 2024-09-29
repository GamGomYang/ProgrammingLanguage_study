#include <stdio.h>
#include <stdlib.h>
#include <sys/stat.h>
#include <unistd.h>
#include <errno.h>

int main(int argc, char *argv[]) {
    if (argc != 2) {
        fprintf(stderr, "mkdir(): Bad address\n");
        exit(1);
    }

    if (mkdir(argv[1], 0755) == -1) {
        perror("mkdir()");
        exit(1);
    }

    if (chdir(argv[1]) == -1) {
        perror("chdir()");
        exit(1);
    }


    char cwd[1024];
    if (getcwd(cwd, sizeof(cwd)) != NULL) {
        printf("cwd: %s\n", cwd);
    } else {
        perror("getcwd()");
    }

    return 0;
}
