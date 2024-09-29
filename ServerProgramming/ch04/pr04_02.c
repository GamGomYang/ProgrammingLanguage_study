#include <stdio.h>
#include <stdlib.h>
#include <dirent.h>
#include <sys/stat.h>
#include <string.h>
#include <unistd.h>
#include <errno.h>

int main(int argc, char *argv[]) {
    if (argc != 2) {
        fprintf(stderr, "Usage: %s <directory_name>\n", argv[0]);
        exit(1);
    }

    DIR *dir = opendir(argv[1]);
    if (dir == NULL) {
        perror("opendir()");
        exit(1);
    }

    struct dirent *entry;
    int is_empty = 1;
    while ((entry = readdir(dir)) != NULL) {
        if (strcmp(entry->d_name, ".") != 0 && strcmp(entry->d_name, "..") != 0) {
            is_empty = 0;
            break;
        }
    }
    closedir(dir);

    if (is_empty) {
        if (rmdir(argv[1]) == -1) {
            perror("rmdir()");
            exit(1);
        } else {
            printf("The directory '%s' is empty.\n", argv[1]);
            printf("The directory '%s' has been deleted.\n", argv[1]);
        }
    } else {
        printf("The directory '%s' is not empty.\n", argv[1]);
    }

    return 0;
}
