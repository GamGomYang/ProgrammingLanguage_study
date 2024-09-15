#include<stdio.h>
#include<stdlib.h>

extern int subnum(int a, int b);

int main(int argc, char *argv[]){

    if(argc !=3){
        return 1;}

   
    
    int num1 = atoi(argv[1]);
    int num2 = atoi(argv[2]);
   

    int sub  = subnum(num1,num2);

    printf("%d - %d = %d\n",num1,num2,sub);
    
    return 0;}
