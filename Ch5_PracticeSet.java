import java.util.Scanner;

public class Ch5_PracticeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1.Program to print following pattren
        System.out.println("\nQ1.Enter the size :");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Q2.Program to sum 1st n even numbers with while loop
        System.out.println("\nQ2.Enter the value of n :");
        int n = sc.nextInt();
        int i = 1, sum = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("The sum of n even numbers is " + sum);

        // Q3.Program to print multiplication table of user enetred n
        System.out.println("\nQ3.Enter number to print multiplication table:");
        n = sc.nextInt();
        for (int j = 1; j <= 10; j++) {
            System.out.println(n + " X " + j + " = " + (n * j));
        }

        // Q4.Program to print multiplication table of user enetred n in reverse order
        System.out.println("\nQ4.Enter number to print multiplication table in reverse order:");
        n = sc.nextInt();
        for (int j = 10; j >= 1; j--) {
            System.out.println(n + " X " + j + " = " + (n * j));
        }

        // Q5.Program to find factorial of given number using for loop
        System.out.println("\nQ5.Enter the value of n:");
        n = sc.nextInt();
        int fact = 1;
        for (int j = 1; j <= n; j++) {
            fact *= j;
        }
        System.out.println("The factorial of " + n + "! = " + fact);

        // Q6.Program to calculate the sum of the result of mutiplication tablee of n
        System.out.println("\nQ6.Enter number to get multiplication table:");
        n = sc.nextInt();
        sum = 0;
        for (int j = 1; j <= 10; j++) {
            System.out.println(n + " X " + j + " = " + (n * j));
            sum += n * j;
        }
        System.out.println("The sum of the result of multiplication table of " + n + " is :" + sum);
        sc.close();
    }
}
