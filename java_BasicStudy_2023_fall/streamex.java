import java.io.File;

public class streamex{
    public static void listDirectory(File dir) {
        System.out.println("------"+dir.getPath()+"의 서브 리스트 입니다.------");
        File[] subFiles = dir.listFiles();
        for(int i=0; i<subFiles.length; i++){
            File f = subFiles[i];
            long t = f.lastModified();
            System.out.print(f.getName());
            System.out.print("\t파일 크기: "+f.length());
            System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t,t,t,t);
        }


    }

    public static void main(String[] args) {
        File f1 =new File("c:\\windows\\system.ini");
        System.out.println(f1.getPath()+", "+f1.getParent()+", "+f1.getName());
        String res = "";
        if(f1.isFile()) res = "파일";
        else if(f1.isDirectory()) res = "디렉토리";
        System.out.println(f1.getPath()+"은 "+res+"입니다.");

        File f2 = new File("c:\\Temp\\java_sample");
        if(!f2.exists()){
            f2.mkdir();
        }
        listDirectory(new File("c:\\Temp"));
        f2.renameTo(new File("c:\\Temp\\javasample"));
        listDirectory(new File("c:\\Temp"));
        
    }
}
  
  
  
  
  /*
  import java.io.*;
  import java.util.Scanner;

  public class streamex{
    public static void main(String[] args) {
        FileReader fin =null;
        int c;

        try{
            fin = new FileReader("C:\\VS code\\javastream.txt");
            BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
            while((c=fin.read()) != -1){
                out.write(c);
            }  
        new Scanner(System.in).nextLine();
        out.flush();
        fin.close();
        out.close();

    }
    catch(IOException e){
        e.printStackTrace();
    }
  }
  }
  
  
  
  /*import java.io.*;

public class streamex{
    public static void main(String[] args) {
        byte b[]= new byte[6];

    
    try{
        FileInputStream fin = new FileInputStream("C:\\VS code\\javastream.txt");
        int n=0, c;
        while((c=fin.read()) != -1){
            b[n] = (byte)c;
            n++;
        }
        System.out.println("C:\\VS code\\javastream.txt에서 읽은 배열을 출력합니다.");
        for(int i=0; i<b.length; i++)
            System.out.print(b[i]+" ");
        System.out.println();

        fin.close();

    }
    catch(IOException e){
        System.out.println("C:\\VS code\\javastream.txt에서 읽을수 없습니다.");
        return;
    }
}}



/*import java.io.*;
import java.util.*;

public class streamex{
    public static void main(String[] args) {
        byte b[]={7,51,3,4,-1,24};
    
    try{
        FileOutputStream fout = new FileOutputStream("C:\\VS code\\javastream.txt");
        for(int i=0; i<b.length; i++)
            fout.write(b[i]);
        fout.close();
    }
    catch(IOException e){
        System.out.println("저장할수 없습니다.");
        
        return;
    }
    System.out.println("저장되었습니다.");
}}



/*import java.io.*;
import java.util.Scanner;
import java.util.*;

public class streamex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fout = null;
        int c;
        try{
            fout = new FileWriter("C:\\VS code\\javastream.txt");
            while(true){
                String line = sc.nextLine();
                if(line.length() == 0)
                    break;
                fout.write(line, 0, line.length());
                fout.write("\r\n", 0, 2);
            }
            fout.close();
        }catch(IOException e){
            System.out.println("입출력 오류");
        }
        sc.close();

    }
}





import java.io.*;

public class streamex{
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileOutputStream fin = null;

        try{
            fin = new FileOutputStream("c:\\windows\\system.ini");
          
            InputStreamReader in = new InputStreamReader(fin, "utf-8");
            int c;

            System.out.println("인코딩 문자의 집합은?"+in.getEncoding());
            while((c=in.read()) != -1){
                System.out.print((char)c);
            }
            in.close();
            fin.close();
        }catch(IOException e){
            System.out.println("입출력 오류");
        }
    }
    }








import java.util.Scanner;
import java.io.*;

public class streamex{
    public static void main(String[] args) {
        FileReader fin =null;
        try{
            fin = new FileReader("c:\\windows\\system.ini");
            int c;
            while((c=fin.read()) != -1){
                System.out.print((char)c);
            }
            fin.close();

        }catch(IOException e){
            System.out.println("입출력 오류");

        }
    }
}
*/