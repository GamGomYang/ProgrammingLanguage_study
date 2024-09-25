#include<stdio.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<stdlib.h>
#include<stdio.h>


int main(){


    int fd;
    struct stat statbuf;

    fd = open("linus.txt", O_RDONLY);
    if(fd == -1){

        perror("open: linus.txt");

        exit(1);

    }

    fstat(fd, &statbuf);

    printf("Inode = %d\n", (int)statbuf.st_ino);
    printf("UID = %d\n",(int)statbuf.st_uid);


    close(fd);
}