#include<stdio.h>
#include<math.h>


int main(void){


    int n=0;

    scnaf("%d",&n);


    for(int i=0; i<n;i++){


        for(int j=0;j<i;j++){

            printf("*");
        }

        printf("\n");
    }

    return 0;
}