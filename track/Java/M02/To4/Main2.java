import java.util.Scanner;

class Student2 {
    int id;
    String name;
    String course;
    double javaScore;
}

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student2 s1 = new Student2();

        s1.id = sc.nextInt();
        sc.nextLine();
        s1.name = sc.nextLine();
        s1.course = sc.nextLine();
        s1.javaScore = sc.nextDouble();

        System.out.println("Student Profile");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Course: " + s1.course);
        System.out.println("Java Score: " + s1.javaScore);

        sc.close();
    }
}