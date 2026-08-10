
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int solvedProblems = sc.nextInt();
        float assessment = sc.nextFloat();
        System.out.println("Learner: " + name);
        System.out.println("Problems solved: " + solvedProblems);
        System.out.println("Assessment: " + assessment);
        // Read and display the profile
        sc.close();

    }
}