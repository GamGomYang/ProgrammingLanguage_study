#include<unistd.h>
#include<stdio.h>
#include<fcntl.h>
#include<stdlib.h>
#include<sys/stat.h>


int main(){
    char *cwd;
    int fd;

    cwd = getcwd(NULL, BUFSIZ);
    printf("1.Current Directory : %s\n",cwd);

    fd = open("bit" , O_RDONLY);
    fchdir(fd);

    cwd = getcwd(NULL,BUFSIZ);
    printf("2.Current Directory : %s\n",cwd);

    if(mkdir("han",0755) == -1){
        perror("han");
        exit(1);
    }
    close(fd);
    free(cwd);
}



