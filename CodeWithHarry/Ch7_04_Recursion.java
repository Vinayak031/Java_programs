import java.util.Scanner;

// Recursion is a method which will call it self to perform a specific task
public class Ch7_04_Recursion {
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }
}
