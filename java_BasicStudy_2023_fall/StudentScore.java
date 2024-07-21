
import java.util.Scanner;

class Student{
    String name;
    int korean;
    int math;
    int english;

    public Student(String name,int korean,int math,int english){
        this.name = name;
        this.math = math;
        this.korean=korean;
        this.english=english;
    }

    public String getName(){
        return name;
    }

    public int getKorean(){
        return korean;
    }

    public int getMath(){
        return math;
    }

    public int getEnglish(){
        return english;
    }
    public int getTotal(){
        return english+korean+math;
    }
    public double getAverage(){
        return getTotal()/3.0;
    }

}

public class StudentScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요");
        int number = scanner.nextInt();

        Student[] students = new Student[number];

        for (int i = 0; i < number; i++) {
            System.out.print("이름 국어 수학 영어 순으로 작성해주세요");
            String name = scanner.next();
            int korean = scanner.nextInt();
            int math = scanner.nextInt();
            int english = scanner.nextInt();

            students[i] = new Student(name, korean, math, english);
        }

        System.out.println("-성적표-");
        System.out.println("====================");
        System.out.println("이름    국어  수학  영어  총합  평균");
        System.out.println("====================");

        for (Student student : students) {
            System.out.printf("%-10s %6d %6d %6d %6d %8.2f\n",
                    student.getName(),
                    student.getKorean(), student.getMath(), student.getEnglish(), student.getTotal(), student.getAverage());
        }

        scanner.close();
    }}
