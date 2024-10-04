#include<stdio.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<unistd.h>
#include<stdlib.h>

int main(){


    int fd;

    fd = open("test.txt", O_RDWR);


    if(fd == -1){

        perror("EXD");
        exit(1);
    }

    printf("test.txt: fd = %d\n",fd);
    close(fd);
}