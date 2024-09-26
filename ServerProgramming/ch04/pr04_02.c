#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>

int main(){

    DIR *dp;
    struct dirent *dent;
    dp = opendir(".");
    

    if(dent == NULL){

        printf("The directory '%s' is empty",dp);

        rmdir(dp);

        printf("The directory '%s' is demeted.",dp);




    }

    else{
        printf("The directory '%s' is not empty ",dp);

        
    }

}