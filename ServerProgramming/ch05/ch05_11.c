#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>

int main(){

    FILE *rfp , *wfp;

    int c;

    if((rfp = fopen("linux.txt","r"))== NULL){

        perror("fopen: linux.txt");
        exit(1);
    }

    if((wfp = fopen("linux.txt","r"))== NULL){
        perror("fopen : linux.out");
        exit(1);
    }

    while((c = fgetc(fp))!= EOF){
        fputc(c,wfp);


    }

    fclose(rfp);
    fclose(wfp);
}