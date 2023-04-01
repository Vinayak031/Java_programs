import java.util.Scanner;

public class Ch1_PracticeSet {
    public static void main(String[] args) {
        // Q1.Add three numbers taking the numbers as input from user
        int num1, num2, num3;
        System.out.println("\nQ1.Enter three values :");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        System.out.println("The Sum of three values is:" + (num1 + num2 + num3));

        // Q2.Give the Average marks of 3 students and take marks input from user
        int marks[] = new int[3];
        int sum = 0;
        System.out.println("\nQ2.Enter three subjects marks (out of 100):");
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
        System.out.println("The Average Subjects marks :" + (sum /= 3));

        // Q3.Take name as input from user and print following string
        String name;
        System.out.println("\nQ3.Enter your name:");
        name = sc.next();
        System.out.println("Hello " + name + " , have a Great day");

        // Q4.Java Program to Convert Kilometers to miles
        double var;
        System.out.println("\nQ4.Enter the Distance in kilometers :");
        var = sc.nextDouble();
        var /= 1.609d;
        System.out.println("Afetr converting kilometers to miles : " + var);

        // Q5. Program to check whether the number enter by the user is integer or not
        boolean num;// Because hasNextInt() method will returns Boolean values
        if (num = sc.hasNextInt()) {
            System.out.println(num + " is an Integer");
        } else {
            System.out.println("No " + num + " is not an integer");
        }
        sc.close();
    }
}
