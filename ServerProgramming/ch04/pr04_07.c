#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <limits.h> 

int main(int argc, char *argv[]) {
    if (argc != 2) {
        printf("no instruction\n");
        exit(1);
    }

    if (symlink(argv[1], "link.sym") == -1) {
        perror("link error");
        exit(1);
    }


    char buf[1024];

    ssize_t len = readlink("link.sym", buf, sizeof(buf) - 1);
    if (len == -1) {
        perror("READLINK error");
        exit(1);
    }
    buf[len] = '\0';
    printf("link.sym: READLINK: %s\n", buf);


    char real_path[PATH_MAX];
    
    if (realpath(buf, real_path) == NULL) {
        perror("REALPATH error");
        exit(1);
    }
     printf("link sym: REALPATH %s\n", real_path);

    return 0;
}
