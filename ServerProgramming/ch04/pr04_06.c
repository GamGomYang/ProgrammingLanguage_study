#include <stdio.h>
#include <stdlib.h>
#include <sys/stat.h>
#include <unistd.h>  

int main(int argc, char *argv[]) {
    if (argc != 3) {
        printf("no argument\n");
        exit(1);
    }

    struct stat statbuf;
    if (stat(argv[2], &statbuf) == -1) {
        perror("file error 파일오류!");
        exit(1);
    }



    mode_t new_mode = strtol(argv[1], NULL, 8);
    if (chmod(argv[2], new_mode) == -1) {
        perror("permitted error 권한 오류!");
        exit(1);
    }

    if (access(argv[2], W_OK) == 0) {
        printf("%s : Write permission is permitted.\n", argv[2]);
    } else {
        printf("%s : Write permission is not permitted.\n", argv[2]);
    }

    if (stat(argv[2], &statbuf) == -1) {
        perror("file specification error");
        exit(1);
    }

    return 0;
}
