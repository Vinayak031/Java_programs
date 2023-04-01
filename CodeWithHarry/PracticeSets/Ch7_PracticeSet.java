import java.util.Scanner;

public class Ch7_PracticeSet {
    // Q1.MultiPlication Table method
    static void MulTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }

    // Q2.Pattern1 Method
    static void pattern1(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // Q3.sum of n natural num
    static int sum(int n) {
        // variable names and method name are different sum is method and with same name
        // we have variable,it is a bad Practice
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    // Q4.Pattern2 Method
    static void pattern2(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // Q5.Fibonacci series
    static long fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    // Q6.Average of set of numbers
    static void varArgs(int... array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        System.out.println("avg of set of numbers " + sum / array.length);
    }

    // Q7. repeate Q4 using recursion
    static int m = 0;

    static void pattern3(int n) {
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        pattern3(n - 1);
    }

    // Q8.repeate Q2 using recursion
    static void pattern4(int n) {
        if (n > 0) {
            pattern4(n - 1);
            // System.out.print(n + " ");
            // System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // Q9.To convert celsius to ferhenheight
    static void celToFer(long n) {
        // (0°C × 9/5) + 32 = 32°F
        double val = (n * (9.0 / 5.0)) + 32.0;
        System.out.println("After converting " + n + " to ferhenheight " + val);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nQ1. Enter the number to get multiplication table:");
        int num = sc.nextInt();
        MulTable(num);

        System.out.println("\nQ2. Enter the number to get Pattren1 :");
        num = sc.nextInt();
        pattern1(num);

        System.out.println("\nQ3. Enter the number to get sum:");
        num = sc.nextInt();
        System.out.println("sum = " + sum(num));

        System.out.println("\nQ4. Enter the number to get Pattern2:");
        num = sc.nextInt();
        pattern2(num);

        System.out.println("\nQ5. Enter the number to get fibonacci number :");
        num = sc.nextInt();
        System.out.println("The fibonacci number at " + num + "th is " + fibo(num));

        System.out.println("\n06. Enter the 5 numbers to get avg of set of numbers:");
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        varArgs(arr);

        System.out.println("\nQ7. Enter the number to get Pattren3 which is using recursion :");
        num = sc.nextInt();
        pattern3(num);

        System.out.println("\nQ8. Enter the number to get Pattren4 which is using recursion :");
        num = sc.nextInt();
        pattern4(num);

        System.out.println("\nQ9. Enter the number to get converted into ferhenheight :");
        long num1 = sc.nextLong();
        celToFer(num1);

        sc.close();
    }
}
