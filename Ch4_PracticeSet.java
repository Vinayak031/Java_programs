import java.util.Scanner;

public class Ch4_PracticeSet {
    public static void main(String[] args) {
        // Q1. Guess output
        System.out.println("\nQ1.Guess output");
        int a = 10;
        // if(a=11)
        if (a == 11) {
            System.out.println("I am 11");
        } else {
            System.out.println("I am not 11");
        }

        // Q2.Program to give Grade by calculating marks entered by the user
        Scanner sc = new Scanner(System.in);
        float sub1, sub2, sub3;
        System.out.println("\nQ2.Enter your marks of three subjects (out of 100):");
        sub1 = sc.nextFloat();
        sub2 = sc.nextFloat();
        sub3 = sc.nextFloat();
        int avg = (int) (sub1 + sub2 + sub3) / 30;
        if (sub1 < 33 || sub2 < 33 || sub3 < 33) {
            System.out.println("Your fail!!");
        } else {
            switch (avg) {
                case 10:
                case 9:
                    System.out.println("Congratulations you got A+ !!");
                    break;
                case 8:
                    System.out.println("Congrates you got A ");
                    break;
                case 7:
                    System.out.println("your Promoted ");
                    break;
                default:
                    System.out.println("Your fail!!");
            }
        }

        // Q3.Program to Calculate the Income Tax
        System.out.println("\nQ3.Enter the amount of income :");
        double incomeTax = sc.nextDouble();
        if (incomeTax < 250000) {
            System.out.println("The tax to be paid is " + incomeTax);
        } else if (incomeTax > 250000 || incomeTax < 500000) {
            double in = incomeTax / 500000 * 5;
            System.out.println("The tax to be paid is " + in);
        } else if (incomeTax > 500000 || incomeTax < 1000000) {
            double in = incomeTax / 1000000 * 20;
            System.out.println("The tax to be paid is " + in);
        } else {
            double in = incomeTax / 10000 * 30;
            System.out.println("The tax to be paid is " + in);
        }

        // Q4.Program to detect leap year or not
        int year;
        boolean flag = false;
        System.out.println("\nQ4.Enter Year to find leap year or not :");
        year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    flag = true;
                }
            }
        }
        if (flag) {
            System.out.println("The year entered is leap year ");
        } else {
            System.out.println("The year entered is not leap year ");
        }

        // if enter marks and press enter then it will store in tNMM
        String tNMM = sc.nextLine(); // TO Not Make Mistake(tNMM)
        System.out.print(tNMM);

        // Q5.Program to Define an website URL Suffixes (like .com, .org, .in)
        String line;
        System.out.println("\nQ5.Enter any URL to detect:");
        line = sc.nextLine();
        if (line.endsWith(".com")) {
            System.out.println("This is a Commercial Website");
        } else if (line.endsWith(".org")) {
            System.out.println("This is a organization Website");
        } else if (line.endsWith(".in")) {
            System.out.println("This is a Indian Website");
        }
        sc.close();
    }
}
