#include <stdio.h>
#include <stdlib.h>
#include <dirent.h>
#include <sys/stat.h>

int main() {
    DIR *dir = opendir(".");
    if (dir == NULL) {
        perror("open error");
        exit(1);
    }

    struct dirent *entry;
    struct stat file_stat;

    while ((entry = readdir(dir)) != NULL) {
        if (stat(entry->d_name, &file_stat) == -1) {
            perror("stat error");
            continue;
        }


        printf("name: %s, inode: %ld\n", entry->d_name, file_stat.st_ino);
    }

    closedir(dir);

    return 0;
}
