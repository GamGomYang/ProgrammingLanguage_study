#include<sys/types.h>
#include<sys/stat.h>
#include<stdio.h>
#include<unistd.h>


int main(){

    struct stat statbuf;

    stat("linux.txt", &statbuf);

    printf("Before Link Count = %d\n", (int)statbuf.st_link);


    link("linux.txt", "linux.ln");

    stat("linux.txt" &statbuf);

    printf("After Link Count = %d\n",(int)statbuf.st_nlink);

    

}


