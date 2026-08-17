package trapractice program;

import java.util.Scanner;

class Mobile {

    void unlock(String password) {
        System.out.println("Unlocking using password");
    }

    void unlock(int pincode) {
        System.out.println("Unlocking using PIN code");
    }

    void unlock(int pincode, String password) {
        System.out.println("Unlocking using PIN code and password");
    }

    void unlock(int pincode, String faceid) {
        System.out.println("Unlocking using PIN code and Face ID");
    }

    void unlock(int pincode, String faceid, String password) {
        System.out.println("Unlocking using PIN code, Face ID and password");
    }

    void unlock(String faceid, String fingerprint, int pincode) {
        System.out.println("Unlocking using Face ID, fingerprint and PIN code");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Mobile m = new Mobile();

        System.out.println("Enter the password:");
        String password = sc.next();
        m.unlock(password);

        System.out.println("Enter the Face ID:");
        String faceid = sc.next();
        m.unlock(faceid);

        System.out.println("fingerprint:");
        String fingerprint = sc.next();
        m.unlock(fingerprint);

        sc.close();
    }
}