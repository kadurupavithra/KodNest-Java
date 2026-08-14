class A {
    void m(short a, short b) {
        System.out.println("short");
    }

    void m(int a, int b) {
        System.out.println("int ");
    }

}

public class Main2 {
    public static void main(String[] args) {
        A a = new A();
        a.m(10, 20);
    }
}
