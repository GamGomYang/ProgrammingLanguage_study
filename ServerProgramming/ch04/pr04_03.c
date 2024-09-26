#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/stat.h>


int main(){
char *cwd;
DIR *dp;
struct dirent *dent;
int fd;

cwd = getcwd(NULL,BUFSIZ);

if(access("./%s",dp,F_OK)!= -1 ){


printf("FILE '%s' does not exist int the current directory",dp);}

else{
printf("FILE'%s' does not exist in the directory",dp);
readdir(dp);


}

}