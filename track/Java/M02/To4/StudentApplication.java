class Student {
    int roll;
    String name;
    double height;

    void run() {
        System.out.println("Running");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

public class StudentApplication {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.height = 250.5;
        s1.roll = 23;
        s1.name = "Kavya";

        System.out.println(s1.height);
        System.out.println(s1.roll);
        System.out.println(s1.name);
        s1.run();
        s1.sleep();
    }
}
