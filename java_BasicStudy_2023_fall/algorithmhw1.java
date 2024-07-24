import java.util.Scanner;


public class algorithmhw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int N = sc.nextInt();
        int XO = sc.nextInt();
        int YO = sc.nextInt();

        int lowX =0;
        int highX = 0;
        int lowY =0;
        int highY =0;


        while(true){ 
            String bombDir = sc.next();

            if(bombDir.contains("U")){
                highY = YO -1;
            }
            else if(bombDir.contains("D")){
                lowY = YO+1;
            }

            if(bombDir.contains("L")){
                highX = XO-1;

            }
            else if(bombDir.contains("R")){
                lowX = XO+1;
            }

            XO = (lowX+highX)/2;
            YO= (lowY+highY)/2;


            System.out.println(XO+" "+YO);
        }

    }    
}
