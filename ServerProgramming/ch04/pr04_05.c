#include <stdio.h>
#include <stdlib.h>
#include <dirent.h>
#include <sys/stat.h>

int main() {
    DIR *dir = opendir(".");
    if (dir == NULL) {
        perror("디렉토리 열기 오류");
        exit(1);
    }

    struct dirent *entry;
    while ((entry = readdir(dir)) != NULL) {
        printf("name: %s, inode: %ld\n", entry->d_name, entry->d_ino);
    }
    closedir(dir);

    return 0;
}
