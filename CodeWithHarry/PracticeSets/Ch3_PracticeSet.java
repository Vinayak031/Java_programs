import java.util.Scanner;

public class Ch3_PracticeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1.Program to convert entire string to lower case
        String str;
        System.out.println("\nQ1.Enter any String(in Capital):");
        str = sc.nextLine();
        System.out.println("after converting to Lower case " + str.toLowerCase());
        // toLowerCase String method is used to conver string to lower case

        // Q2.Program to replace space (' ') to unerscore('_')
        String str1;
        System.out.println("\nQ2.Enter any Sentence ");
        str1 = sc.nextLine();
        System.out.println("After replacing space with underScore");
        System.out.println(str1.replace(" ", "_"));

        // Q3.replace string <|name|> with user Entered String
        String name;
        System.out.println("\nQ3.Enter any name ");
        name = sc.next();
        String str2 = "Dear <|name|>,\n\tThis is Chapter 3 Practice Set\n\t   Thank You";
        str2 = str2.replace("<|name|>", name);
        System.out.println(str2);

        // Q4.Program to Detect double and thrible spaces in java
        System.out.println("\nQ4. Detect double and thrible spaces\t");
        String str3 = "Hi Vinayak  This is            Practice set       forth  Quetion";
        System.out.println("The number of occurence of double and Thrible spaces is at index :");
        System.out.println(str3.indexOf("  "));
        System.out.println(str3.indexOf("   "));

        // Q5.Program to formatt a letter using escaape sequences
        System.out.println("\nQ5.formatt a letter using escaape sequences\t");
        String Letter = " Dear Vinayak,We have started java course Thankyou";
        System.out.println("Before using escape sequence: ");
        System.out.println(Letter);
        Letter = " Dear Vinayak,\n\t\"We have started java course\"\n\t\t Thankyou";
        System.out.println("After adding escape sequence :");
        System.out.println(Letter);
        sc.close();
    }
}
