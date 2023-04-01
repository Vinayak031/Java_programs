import java.util.Scanner;

public class Ch3_01_Strings {
    public static void main(String[] args) {
        // We can initialize the String in two ways
        String str = new String("Vinayak");
        System.out.println("The string in str is " + str);
        // (OR)
        String str1 = "Vinayak"; // Both the methods will return same ans
        System.out.println("The string in str1 is " + str1);

        // * There are diffrent types of Output stream
        System.out.print("This output is using print \n");
        System.out.println("This out is using println");
        System.out.printf("This output is using prirntf\n");
        System.out.format("This is using format\n"); // it work similarly as printf

        // String can be taken as input from Scanner
        Scanner sc = new Scanner(System.in);
        String str2, str3;
        System.out.println("Enter any String:");
        str2 = sc.next(); // It will take the input as only one word, Ex:(my code) then it will take only
                          // my as an input
        System.out.println("The String inside the str2 is " + str2);
        str3 = sc.nextLine();// it will take whole line as input
        System.out.println("The string inside the str3 is " + str3);
        sc.close();
    }
}
