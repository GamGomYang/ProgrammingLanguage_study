#include<stdio.h>
#include<sys/stat.h>
#include<sys/types.h>
#include<unistd.h>
#include<stdlib.h>


int main(int argc, char[] *argv){


    struct stat statbuf;
    char file_name;
    //while문 설정 어떻게 해야하는가?

    while(){

        printf("'%s'Inode =%d\n ",file_name,(int)statbuf.st_ino);

    }
}