class Employee {
    int id;
    String name;

    void work() {
        System.out.println("working");
    }
}

class EmployeeApplication {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 11;
        e1.name = "raju";

        Employee e2 = e1;
        e2.id = 12;
        e2.name = "raj";
        System.out.println(e1.id);
        System.out.println(e1.name);
    }
}