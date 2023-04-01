
// Object Oriented programming (OOP)
import java.util.Scanner;

// Q1.create a custome class Employee
class Employee {
    int salary;
    String name;

    int getSalary() {
        return salary;
    }

    String getName() {
        return name;
    }

    void setName(String n) {
        System.out.println("Your name is changed from " + name + " to " + n);
        name = n;
    }

    void printDetails() {
        System.out.println("Name = " + name);
        System.out.println("Holding salary of " + salary);
    }
}

// Q2.custome class cellPhone
class cellPhone {
    void cellRing() {
        System.out.println("Ringging......");
    }

    void cellvibrate() {
        System.out.println("Vibrating......");
    }

    void playSong() {
        System.out.println("Aaaaaaaaaaaaaaaaahhhhhhh Aaaaaaaaaaaaaahhhhhhhh");
    }

    void game() {
        System.out.println("Snake Game");
        System.out.println("Airoplane game");
        System.out.println("pack man");
    }
}

// Q3.class square to get area,perimeter

class square {
    int a;

    void area() {
        System.out.println("The area of a square is " + (a * a));
    }

    void perimeter() {
        System.out.println("The perimeter of a square is " + (4 * a));
    }
}

// Q4.class rectanle to get area,perimeter
class rectangle {
    int l, b;

    void area() {
        System.out.println("The area of Rectangle is " + (l * b));
    }

    void perimeter() {
        System.out.println("The Perimeter of Rectangle is " + (2 * (l + b)));
    }
}

// Q6.class circle to get area ,perimeter
class circle {
    int r;

    void area() {
        System.out.println("The area of a circle is " + (3.14 * r * r));
    }

    void perimeter() {
        System.out.println("The perimeter of a square is " + (2 * 3.14 * r));
    }
}

public class Ch8_PracticeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Problem 1
        System.out.println("\nQ1.custom class Employee ");
        // Creating object to a class
        Employee obj = new Employee();

        // Setting values to the attributes
        obj.salary = 2300;
        obj.name = "Vinayak";

        // Getting salary details using getSalary() mathod
        int salary = obj.getSalary();
        System.out.println(salary);

        // Changing the Assigned name by using setName() method
        obj.setName("vinayak");

        // Printing details
        obj.printDetails();

        // Problem 2
        System.out.println("\nQ2.custom class cellPhone");
        // Creating Object of class cellPhone
        cellPhone obj1 = new cellPhone();
        // Calling methos of class by its instants
        obj1.cellRing();
        obj1.cellvibrate();
        obj1.playSong();
        obj1.game();

        // Problem 3
        System.out.println("\nQ3.custom class square");
        // Creating Object of class square
        square obj2 = new square();
        // assigning value to attribute
        obj2.a = 10;
        // Calling methos of class by its instants
        obj2.area();
        obj2.perimeter();

        // Problem 4
        System.out.println("\nQ4.custom class Rectangle");
        // Creating Object of class rectangle
        rectangle obj3 = new rectangle();
        // assigning value to attribute
        obj3.l = 10;
        obj3.b = 20;
        // Calling methos of class by its instants
        obj3.area();
        obj3.perimeter();

        // Problem 6
        System.out.println("\nQ6.custom class circle");
        // Creating Object of class circle
        circle obj6 = new circle();
        // assigning value to attribute
        System.out.println("Enter any value");
        obj6.r = 20;
        // Calling methos of class by its instants
        obj6.area();
        obj6.perimeter();

        sc.close();
    }
}
