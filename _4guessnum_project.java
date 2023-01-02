import java.util.*;

public class _4guessnum_project {
    public static void main(String[] args) {
        int usernum;
        double randomnum;

        // Generating random number using Math Class
        randomnum = (Math.random() * 100);
        int n = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Guess any number: ");

            // Taking input from user
            usernum = sc.nextInt();

            // Comparing the numbers
            if (usernum < 0) {
                continue;
            }
            if (usernum == (int) randomnum) {
                System.out.println("Whooo the number is correct!!");
                break;
            } else if (usernum < (int) randomnum) {
                System.out.println("Enter higher value");
            } else {
                System.out.println("Enter lower value");
            }
            n++;
        } while (usernum >= 0);
        System.out.println("You guessed the number for " + n + " Attempts ");
        System.out.println("The random value is " + " " + (int) randomnum);
        sc.close();
    }
}
