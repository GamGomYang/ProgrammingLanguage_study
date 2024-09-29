#include <stdio.h>
#include <stdlib.h>
#include <sys/stat.h>

int main(int argc, char *argv[]) {
    if (argc != 2) {
      printf("no instruction");
        exit(1);
    }

    struct stat statbuf;
    if (stat(argv[1], &statbuf) == -1) {
        perror("error");
        exit(1);
    }

    printf("SIZE= %ld\n", statbuf.st_size);

    return 0;
}
