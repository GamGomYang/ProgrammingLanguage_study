#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>


int main(){
    char *cwd;
    char wd1[BUFSIZ];
    char wd2[10];



    int mkdir(const char *pathname, mode_t mode);
    int chdir(const char *path);
    char *getcwd(buf[.size], size_t size);

    cwd = getcwd(NULL,BUFSIZ);
    
    

    if(*pathname == NULL){

        perror("mkdir(): bad adress");

        exit(1);

    }

   printf("cwd1 = %s\n", cwd);
    free(cwd);


}