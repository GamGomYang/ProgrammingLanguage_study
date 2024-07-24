import java.util.Scanner;
public class QuickSort {

    private int partition(int arr[],int low,int high){
        int pivot = arr[high];
        //pivot을 기준으로 큰수와 작은수를 구분하기위해 i와j를 사용
        //i-> pivot보다 작은 수
        //j-> pivot보다 큰수

        int i = low -1;

        for(int j = low; j<high;j++){
            if(arr[j]<=pivot){
                i++;
                //if pivot보다 작으면 i영역으로 포함

                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                //if pivot보다 작은영역이 j영역에 있다면 swap을 이용하여 
                //pivot의 왼쪽 영역으로 이동한다.
            }
        }
        int temp = arr[i+1];
        arr[i+1]= arr[high];
        arr[high]= temp;
        //가장 끝자리 배열에 있는 pivot값을 i와j사이인 영역에 삽입
        return i+1;
    
    }

    public void sort( int arr[],int low,int high){
        if(low<high){
            int pi = partition(arr,low,high);

            sort(arr,low,pi-1);
            sort(arr,pi+1,high);
        }
    }//재귀적으로 정렬 partition과정을 각각의 쪼개어진 요소마다 재귀적으로 실행
    //결국 low = high = 1 일때 멈춤

    public static void printArray(int arr[]){
        int n = arr.length;
        for(int i =0;i<n;++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //QuickSort 를 끝내고 출력하는 함수
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기가 얼마인가요?");
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();}

        QuickSort sorting = new QuickSort();
        sorting.sort(arr,0,n-1);
        printArray(arr);
        
        sc.close();
    }
        
}
