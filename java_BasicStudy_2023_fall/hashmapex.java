
import java.util.*;

class Student {
    int id;
    String tel;

    public Student(int id, String tel) {
        this.id = id;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public String getTel() {
        return tel;
    }
}

public class hashmapex {

    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<String, Student>();

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("입력할 학생 수를 입력하세요:");
        num = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < num; i++) {
            System.out.println("학생 이름과 전화번호를 입력하세요:");
            String name = scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            map.put(name, new Student(i, phoneNumber));
        }

        while (true) {
            System.out.print("검색할 이름을 입력하세요 ");
            String name = scanner.nextLine(); 
            if (name.equals("exit"))
                break;
            Student student = map.get(name);
            if (student == null)
                System.out.println(name + "은(는) 없는 학생입니다.");
            else
                System.out.println("ID: " + student.getId() + ", 전화: " + student.getTel());
        }
        scanner.close();
    }
}
