package M02.To6;

public class Student {
    String name;
    int age;
    double height;

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void diplay() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class po1 {
    public static void main(String[] args) {
        Student s1 = new Student("pavi", 18, 5.5);
        s1.diplay();
    }
}
