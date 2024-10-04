#include <sys/types.h>
 #include <fcntl.h>
 #include <unistd.h>
 #include <stdlib.h>
 #include <stdio.h>

 int main() {
 int fd, fd1;

fd = open("tmp.aaa", O_CREAT | O_WRONLY | O_TRUNC, 0644);
if(fd == -1){
    perror("creat tmp.aaa");
    exit(1);
}

close(1);

fd1 = dup(fd);
printf("DUP FD = %d\n",fd1);

printf("standard Output Redirection \n");

close(fd);}