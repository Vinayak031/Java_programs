import java.util.Scanner;

public class Ch2_PracticeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1. Program to Encrypt the Grade by 8
        char Grade;
        System.out.println("\nQ1.Enter your Grade:");
        Grade = sc.next().charAt(0);
        // Encrypting
        Grade = (char) (Grade + 8);
        System.out.println("The value After Encryption is :" + Grade);
        // Decrypting
        Grade = (char) (Grade - 8);
        System.out.println("The Original value is :" + Grade);

        // Q2.Program to find whether the number entered is greater Given number(num) or
        // not
        int num = 45, num1;
        System.out.println("\nQ2.Enter a integer:");
        num1 = sc.nextInt();
        if (num1 > num) {
            System.out.println("The " + num1 + " is greater an the number Given " + num);
        } else {
            System.out.println("The Given " + num + " is greater an the number " + num1);
        }

        // Q3.Program to Execute an Expresion:
        double v, u, a, s;
        System.out.println("\nQ3.Enter Four values:");
        v = sc.nextDouble();
        u = sc.nextDouble();
        a = sc.nextDouble();
        s = sc.nextDouble();
        double ans = (v * v - u * u) / (2.0 * a * s);
        System.out.println("The value is " + ans);
        sc.close();
    }
}
