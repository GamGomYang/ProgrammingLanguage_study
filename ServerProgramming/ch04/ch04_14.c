#include<sys/errno.h>
#include<unistd.h>
#include<stdio.h>


extern int errno;

int main(){

    int perm;


    if(access("linus.bak",F_OK) == -1 && errno == ENOENT){
        printf("linux.bak : File not exitst\n");
    }


    perm = access("linux.txt",R_OK);


    if(perm == 0){
        printf("linux.txt: read permission is permmitted\n");
        else if(perm == -1 && errno == EACCES){
            printf("linux.txt: Read permmission is not permmitted");
        }
    }
}