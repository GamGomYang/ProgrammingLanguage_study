#include<sys/stat.h>
#include<sys/types.h>
#include<unistd.h>
#include<stdio.h>
#include<stdlib.h>


int main(int argc , char* argv){

    DIR *dp;

    dp = argc[0];
    

    struct stat statbuf;
    

    stat(dp, &statbuf);
    printf("Before Link Count = %d\n", (int)statbuf.st_nlink);

// link함수 어떻게 해야하는지?
// int symlink(const char * target, const char *linkpath);

    symlink()

   stat(dp, &statbuf);
   printf("link count = %d\n",(int)statbuf.st_nlink);

   return 0;
}