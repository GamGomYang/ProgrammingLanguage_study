#include <stdio.h>
#include <stdlib.h>
#include <sys/stat.h>
#include <unistd.h>  

int main(int argc, char *argv[]) {
    if (argc != 3) {
        fprintf(stderr, "Usage: %s <mode> <filename>\n", argv[0]);
        exit(1);
    }

    struct stat statbuf;
    if (stat(argv[2], &statbuf) == -1) {
        perror("파일 정보 확인 오류");
        exit(1);
    }

    printf("%s: 현재 권한: %o\n", argv[2], statbuf.st_mode & 0777);


    mode_t new_mode = strtol(argv[1], NULL, 8);
    if (chmod(argv[2], new_mode) == -1) {
        perror("권한 변경 오류");
        exit(1);
    }

    if (access(argv[2], W_OK) == 0) {
        printf("%s : Write permission is permitted.\n", argv[2]);
    } else {
        printf("%s : Write permission is not permitted.\n", argv[2]);
    }

    if (stat(argv[2], &statbuf) == -1) {
        perror("파일 정보 확인 오류");
        exit(1);
    }

    return 0;
}
