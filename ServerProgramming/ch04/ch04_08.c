#include<stdio.h>
#include<dirent.h>
#include<stdlib.h>


int main(){
    DIR *dp;
    struct dirent *dent;
    dp = opendir(".");
    while((dent = readdir(dp))){
        printf("name : %s", dent -> d_name);
        printf("Inode : %d\n", (int)dent -> d_ino);

    }

    closedir(dp);
}




