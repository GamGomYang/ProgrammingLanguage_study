#include<stdio.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<unistd.h>
#include<stdlib.h>

int main(){


    int fd;

    fd = open("test.txt", O_CREAT | O_EXCL, 0644);


    if(fd == -1){

        perror("EXD");
        exit(1);
    }
    close(fd);
}