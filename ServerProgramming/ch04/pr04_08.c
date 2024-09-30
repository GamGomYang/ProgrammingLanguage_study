#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/stat.h>

int main(int argc, char *argv[]) {
    if (argc != 2) {
        fprintf(stderr, "Usage: %s <filename>\n", argv[0]);
        exit(1);
    }    
    const char *filename = argv[1];
    const char *linkname = "hardlink";

    struct stat statbuf;
    if (stat(filename, &statbuf) == -1) {
        perror("file error!: 파일 정보 오류");
        exit(1);
    }
    printf("Before Link Count = %ld\n", (long)statbuf.st_nlink);


    if (link(filename, linkname) == -1) {
        perror("link error!: 하드 링크 오류");
        exit(1);
    }

    if (stat(filename, &statbuf) == -1) {
        perror("file error!: 정보 확인 오류");
        exit(1);
    }
    printf("After Link Count = %ld\n", (long)statbuf.st_nlink);


    if (unlink(linkname) == -1) {
        perror("link error!: 제거 오류");
        exit(1);
    }

    if (stat(filename, &statbuf) == -1) {
        perror("file error!: 확인 오류");
        exit(1);
    }
    printf("After Unlink Count = %ld\n", (long)statbuf.st_nlink);

    return 0;
}
