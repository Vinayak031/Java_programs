import java.util.Scanner;

// **** Snake-Water-Gun Game ****
public class _6_swg_Game {
    public static int game(char y, char c) {

        // for Non-common case
        // sg
        // sw
        // wg
        if (y == 's' && c == 'g') {
            return -1;
        } else if (y == 'g' && c == 's') {
            return 1;
        }

        if (y == 's' && c == 'w') {
            return 1;
        } else if (y == 'w' && c == 's') {
            return -1;
        }

        if (y == 'w' && c == 'g') {
            return -1;
        } else if (y == 'g' && c == 'w') {
            return 1;
        }

        // For common case

        return 0;
    }

    public static void main(String[] args) {
        char you, comp;
        int ynum, cnum;
        ynum = cnum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times you want to play:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = (int) (Math.random() * 100);
            if (number < 33) {
                comp = 's';
            } else if (number > 33 && number < 66) {
                comp = 'w';
            } else {
                comp = 'g';
            }
            System.out.println("Enter 's' for Snake (or) 'w' Water (or) 'g' for Gun [Enter any charecter to exit:]");
            System.out.println(number);
            you = sc.next().charAt(0);
            int num = game(you, comp);
            if (num == 1) {
                ynum++;
            } else if (num == -1) {
                cnum++;
            }
            System.out.println("You choose " + you + " computer choose " + comp);
        }
        if (ynum > cnum) {
            System.out.println("You Win !!!");
            System.out.println("You scored " + ynum + " comp scored " + cnum);
        } else {
            System.out.println("You Lose ");
            System.out.println("You scored " + ynum + " comp scored " + cnum);
        }
        sc.close();
    }
}