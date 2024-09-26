#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/stat.h>
#include<sys/types.h>


int main(int argc, char[] *argv){

struct stat statbuf;
if(argv[1]==NULL){

    printf("driectory %s is not exist", file_name);
    
}
char file_name=argv[1]; 
stat(file_name);

printf("SIZE = %d\n", (int)statbuf.st_size);

return 0;
    
}