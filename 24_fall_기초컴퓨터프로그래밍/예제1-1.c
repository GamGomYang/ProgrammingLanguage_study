#include<stdio.h>
#include<math.h>
#include<stdlib.h>


void adder(int a, int b) {
	int result = 0;
	result = a + b;

	printf("결과 : %d", result);

}

void divider(int a, int b) {

	int result = 0;
	int mod = 0;


	if (a % b > 0) {
		result = a / b;
		mod = a % b;

		printf("결과 : 몫 %d 나머지 %d", result, mod);
	}
	else {
		result = a / b;

		printf("결과 : 몫 %d ", result);
	}
}


int main(void) {


	printf("============계산기=============\n");

	printf("\n");
	printf("1.더하기 \n");
	printf("2.곱하기 \n");
	printf("3.나누기 \n");
	printf("4.구구단 \n");
	printf("5.제곱 \n");
	printf("6.복합연산 \n");
	printf("\n");

	printf("==============================\n");
	printf("===made by geum young @2024===\n");

	int mode = 0;
	scanf_s("%d", &mode);

	int result = 0;
	int a = 0;
	int b = 0;
	int mod = 0;

	if (mode == 1) {

		printf("=========더하기 모드========\n");

		printf("숫자를 입력해주세요\n");
		scanf_s("%d", &a);
		printf("더하기\n");
		scanf_s("%d", &b);

		result = a + b;

		printf("결과 : %d\n", result);



	}
	else if (mode == 2) {

		printf("=========곱하기 모드========\n");
		printf("숫자를 입력해주세요\n");
		scanf_s("%d", &a);
		printf("곱하기\n");
		scanf_s("%d", &b);

		result = a * b;

		printf("결과 : %d\n", result);

	}
	else if (mode == 3) {
		printf("=========나누기 모드========\n");
		printf("숫자를 입력해주세요\n");
		scanf_s("%d", &a);
		printf("나누기\n");
		scanf_s("%d", &b);

		if (a % b > 0) {
			result = a / b;
			mod = a % b;

			printf("결과 : 몫 %d 나머지 %d\n", result,mod);
		}
		else  {
			result = a / b;

			printf("결과 : 몫 %d\n ", result);
		}
		

	}
	else if(mode == 4) {
		printf("숫자를 입력해주세요\n");
		scanf_s("%d", &a);

		printf("==============%d 단=============\n", a);
		for (int i = 1; i < 10; i++) {

			result = a * i;


			printf("%d x %d = %d \n",a , i, result);
		}
	}

	else if (mode == 5) {
		printf("=========제곱 모드========\n");
		printf("숫자를 입력해주세요\n");
		scanf_s("%d", &a);
		printf("제곱\n");
		scanf_s("%d", &b);

		for (int k = 1; k <= b; k++) {

			result = a * a;
		}

		printf("결과 : %d\n", result);


	}
	
	int return_number = 0;
	printf(" 0 = 끝내기 1 = 초기화면으로 돌아가기\n");
	scanf_s("%d", &return_number);


	if (return_number == 0) {
		return 0;
	}
	else if (return_number == 1) {
		return main();
	}

	return 0;
	
}

