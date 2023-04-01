
// Guess the Number Game By using Object Oriented Programming (OOP's) concepts
import java.util.Random;
import java.util.Scanner;

class Game {
    // noOfGuesses variable is used for counting the guesses
    private int noOfGuesses = 0;

    // randomValue variable is used for storing the generated randome value
    int randomValue;

    // userval is used for taking input from the user
    int userval;

    Scanner sc = new Scanner(System.in);

    void takeUserInput() {
        // Taking the input from the User
        System.out.println("Enter the value between 0 to 100");
        userval = sc.nextInt();
    }

    // Constructer
    public Game() {
        // Generating a Random number
        Random rd = new Random();
        randomValue = rd.nextInt(100);

        // Actual Logic
        do {
            // System.out.println(obj.randomValue);
            this.takeUserInput();
            this.setNum();
            this.isCorrectNumber(userval, randomValue);
            if (userval == randomValue) {
                // Printting the number and no of guesses
                System.out.println("Congradulations you have guessed the correct value in "
                        + this.getNum()
                        + " guesses and the number is " + randomValue);
                break;
            }

        } while (true);
        System.out.println("Thanks for playing the game");
    }

    void isCorrectNumber(int num, int rnum) {
        // Checking the condition
        if (num > rnum) {
            System.out.println("Enter small value");
        } else if (num < rnum) {
            System.out.println("Enter Big number");
        }
    }

    void setNum() {
        // Incrementing the noofGuesses
        noOfGuesses += 1;
    }

    int getNum() {
        // Last count has been returning
        return noOfGuesses;
    }
}

public class Ch9_GuessTheNumber {

    public static void main(String[] args) {
        // Creating the object for the Game class
        Game obj = new Game();
        System.out.println(obj.randomValue);
    }
}
