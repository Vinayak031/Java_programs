
// Program on Getter and Setter
import java.util.Scanner;

class circle {
    Scanner sc = new Scanner(System.in);
    private int radius;

    // setter method for circle
    void setRadius(int r) {
        radius = r;
    }

    // Getter method for circle
    int getRadius() {
        return radius;
    }

    void area() {
        System.out.println("The area of circle is " + (3.14 * radius * radius));
    }

    void perimeter() {
        System.out.println("The Perimeter of the circle is " + (2 * 3.14 * radius));
    }

}

public class Ch8_gettersAndSetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle o = new circle();
        // Takking radius value as input from the user
        System.out.println("Enter value for the radiues of the circle ");
        int r = sc.nextInt();
        System.out.println("Enter same value again");
        if (sc.hasNextInt()) {
            // calling the methods of the circle classs
            o.setRadius(r);
            System.out.println(o.getRadius());
            o.area();
            o.perimeter();
        } else {
            System.out.println("You have Entered Invalid value for radius");
        }
        sc.close();
    }
}
