import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer value ");
        int a = sc.nextInt();
        System.out.println("Enter a Byte value ");
        byte b = sc.nextByte();
        System.out.println("Enter a float value ");
        float c = sc.nextFloat();
        System.out.println("Enter a double value ");
        double d = sc.nextDouble();
        System.out.println("Enter a boolean value ");
        boolean e = sc.nextBoolean();
        System.out.println("Enter a long  value ");
        long l = sc.nextLong();
        System.out.println("Enter a string value ");
        String s = sc.next();
        System.out.println("Enter a char  value ");
        char f = sc.next().charAt(0);

    }
}