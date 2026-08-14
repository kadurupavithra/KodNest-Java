
import java.util.Scanner;

class Student2 {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Student Name: " + name);
    }
}

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Student2 s = new Student2();
        s.setName(name);
        s.displayName();
    }
}
