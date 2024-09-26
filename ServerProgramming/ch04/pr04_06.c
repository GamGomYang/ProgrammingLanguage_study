#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/errno.h>

extern int errno;

int main(int argc, char[] *argv)
DIR *dp;


{
int perm;

if(access(pd, F_OK)== -1 && errno == ENOENT){
    printf("%s is not exit",dp);

}

perm = access(dp,R_OK);

if(perm == 0){

    printf("%s: read permission is permmitted.\n",pd);

    
}
else if(perm == -1 && errno ==EACESS){
    printf("%s: Read permmissions is not permmitted\n",dp);
    
}

}