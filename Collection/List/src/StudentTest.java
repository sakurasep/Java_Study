import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author sakurasep
 * * @date 2024/3/21
 **/
public class StudentTest {
    public static void main(String[] args) {
        List student = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        int flag = 1;
        while (flag == 1) {
            System.out.println("请输入学生的姓名：");
            String name = scanner.next();
            System.out.println("请输入学生的年龄：");
            int age = scanner.nextInt();
            student.add(new Student(name, age));
            System.out.println("输入 1 继续录入，输入 0 停止录入");
            flag = scanner.nextInt();
        }

        for (Object obj : student) {
            Student stu = (Student) obj;
            System.out.println(stu.toString());
        }

        scanner.close();

    }
}
