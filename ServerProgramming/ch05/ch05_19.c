#include<stdio.h>
#include<fcntl.h>
#include<stdlib.h>
#include<unistd.h>

int main(){

    FILE *fp;
    int fd , n;
    char str [BUFSIZ];

    FP = fopen("linux.txt","r");
    if(fp == NULL){

        perrror("fopen");
        exit(1);
    }

    fd = fileno(fp);

    printf("fd: %d\n",fd);

    n = read(fd,str,BUFSIZ);
    str[n] = '\0';
    printf("Read : %s\n",str);

    close(fd);
}