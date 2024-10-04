#include <sys/types.h>
 #include <fcntl.h>
 #include <unistd.h>
 #include <stdlib.h>
 #include <stdio.h>

 int main() {
 int fd, fd1;

fd = open("tmp.aaa", O_CREAT | O_WRONLY | O_TRUNC, 0644);
if(fd == -1){
    perror("creat tmp.bbb");
    exit(1);
}

dup2(fd,1);
printf("DUP2:Standard Output Redirection\n");}