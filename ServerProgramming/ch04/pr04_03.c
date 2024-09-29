#include <stdio.h>
#include <dirent.h>
#include <sys/stat.h>
#include <string.h>

int main(int argc, char *argv[]) {
    struct dirent *de;
    DIR *dr = opendir(".");
    struct stat file_stat;

    if (dr == NULL) {
        printf("Could not open current directory");
        return 0;
    }

    int found = 0;
    while ((de = readdir(dr)) != NULL) {
        stat(de->d_name, &file_stat);

        if (S_ISREG(file_stat.st_mode)) {
            if (strcmp(de->d_name, argv[1]) == 0) {
                printf("File '%s' exists in the current directory.\n", argv[1]);
                found = 1;
                break;
            }
        }
    }

    if (!found) {
        printf("File '%s' does not exist in the current directory.\n", argv[1]);
    }

    closedir(dr);
    return 0;
}
