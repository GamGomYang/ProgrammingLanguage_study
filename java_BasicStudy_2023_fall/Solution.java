

    /*
    
import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean flag = sc.nextBoolean();

        Solution calculate = new Solution();
        int result = calculate.solution(a,b,flag);
        System.out.print(result);

    }
    public int solution(int a, int b, boolean flag){
        int answer =0;
        if(flag){
            answer = a+b;
        }
        else{
            answer = a-b;
        }
        return answer;
    }
}




import java.util.Scanner;
public class Solution{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution calculate = new Solution();
        int result = calculate.solution(n);

        System.out.print(result);
    }

    public int solution(int n){
        int answer=0;
        int number=0;
        int i=2;
        int result_1=0;
        int result_2=0;
        
        if((n%2) == 0 ){
         number = n/2;
         while(i<=n){
            result_1 += (i*i);

            i=i+2;
         }
         answer = result_1;
            
        }
        else{
            i=1;
            while(i <= n){
                
                result_2 += i;
                i = i+2;
            }
            answer = result_2;
        }
        return answer;}
    }




import java.util.Scanner;
public class Solution{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        Solution calculater = new Solution();
        int result = calculater.solution(number,n,m);
        System.out.print(result);
    }

    public int solution(int number,int n, int m){
        int answer=0;
        int result_1 = (number%n);
        int result_2 = (number%m);

        if(result_1==0&&result_2==0){
            answer = 1;
        }
        else{
            answer = 0;
        }

        return answer;

    }
}


import java.util.Scanner;

public class Solution{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n =sc.nextInt();

        Solution calculate =new Solution();
        int result=calculate.solution(num,n);

        if(result == 0){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }

    }
    public int solution(int num,int n){
            int answer=0;

        answer = num%n;
        return answer;

    }
}



import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Solution calculate = new Solution();

        int final_result =  calculate.solution(a,b);

        System.out.println(final_result);

        
    }
    public int solution(int a, int b){
        int answer = 0;
        int result_1;
        int result_2;
        String calculate_1 = Integer.toString(a)+Integer.toString(b);
        String calculate_2 = Integer.toString(b)+Integer.toString(a);
        result_1= Integer.parseInt(calculate_1);
        result_2 =Integer.parseInt(calculate_2);

        if(result_1>result_2){
            answer = result_1;
        }
        else{
            answer = result_2;
        }


        return answer;
    }
}



import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Solution solution = new Solution();
        int result = solution.solution(a, b);

        System.out.println(result);
    }

    public int solution(int a, int b) {
        int answer = 0;
        String number = Integer.toString(a) + Integer.toString(b);
        int result_2 = 2*a * b;
        int result_1 = Integer.parseInt(number);

        if (result_1 > result_2) {
            answer = result_1;
        } else {
            answer = result_2;
        }
        return answer;
    }
}



    
public class Solution {
   public static void main(String[] args) {
   int[] num_list = {1,2,3,4,5};

   int[]result= solution(num_list);

   for(int num : result){
    System.out.print(num+" ");
   }

}    
    public static int[] solution(int[] num_list){
        int length = num_list.length;
        int[]answer=new int[length];
        
        for(int i=0;i<length;i++){
            answer[i]=num_list[length-i-1];
        }
        return answer;
    
    }
}

    문자열 반복
    import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_String = sc.nextLine();

        int k = sc.nextInt();

        Solution solution = new Solution();

        String result = solution.solution(my_String,k);

        System.out.println(result);

        sc.close();}

     public String solution(String my_String,int k){
        StringBuilder answer = new StringBuilder();
        for(int i=0;i<k;i++){
            answer.append(my_String);
        }

        return answer.toString();
     }}




    package java_study;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String arr[]={"a","b","c"};


        String result = solution(arr);
        System.out.println(result);
    }

    public static String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();
        for (String c : arr) {
            answer.append(c);
        }

        return answer.toString();
    }
}


문자열 교차하기
import java.util.Scanner;


public class Solution{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Solution solution = new Solution();
        String answer= solution.solution(str1,str2);

        System.out.println(answer);

        sc.close();

        
    }


    public String solution(String str1,String str2){

        StringBuilder answer = new StringBuilder();
        int minstr =0;
        if(str1.length()>=str2.length()){
            minstr = str1.length();
        }
        else{
            minstr = str2.length();
        }
        for(int i=0;i<minstr;i++){
            answer.append(str1.charAt(i));
            answer.append(str2.charAt(i));
            
        }

        return answer.toString();
    }
}
//여기에서 간과한점 -> 두 인덱스 length의 길이를 더하여야한다고 생각했다
//하지만 만약 한인덱스가 작다면 에러가 난다


문자열 추가하기 (가변성 StringBuilder 사용)
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
       String my_String = sc.nextLine();
       String overwrite_String = sc.nextLine();
        int s = sc.nextInt();

        Solution solution = new Solution();
        String result = solution.solution(my_String,overwrite_String,s);

        System.out.println(result);

        sc.close();

   
    }
    public String solution(String my_String, String overwrite_String,int s){
       
        StringBuilder result = new StringBuilder();

        for(int i =0; i<s;i++){
            result.append(my_String.charAt(i));
            
        }

        result.append(overwrite_String);

        for(int i = s+overwrite_String.length();i<my_String.length();i++){
            result.append(my_String.charAt(i));
        }

        return result.toString();


    }}
   


 문자열 세로로 출력 
 package java_study;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] input = str.toCharArray();


        for(char output : input ){
            System.out.println(output);
        }
        

        sc.close();

     
}}
 
짝/홀 구분
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
   int a = sc.nextInt();

   if(a%2 == 0 ){
    System.out.println(a+" is even");
   }
   else{

    System.out.println(a+"is odd");
   }

   sc.close();

}}

 */
