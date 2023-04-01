import java.util.Scanner;

class Cylinder {
    // Taking private values radius,heught
    private double radius, hieght;

    // Q1.Cylinder class with getter and setter
    // using setvalue() to assign values
    // void setvalue(double r, double h) {
    // radius = r;
    // hieght = h;
    // }

    // getval to print the private values
    // void getvalue() {
    // System.out.println("The Radius is " + radius + " and the hieght is " +
    // hieght);
    // }
    // Q3.use Contructor and assign values to the private values
    public Cylinder(double r, double h) {
        radius = r;
        hieght = h;
    }

    // Q2.Calculate the surface area and volume of the cylinder
    void surfaceArea() {
        System.out.println("The surface area of Cylinder is "
                + ((2 * 3.14 * radius * hieght) + (2 * 3.14 * radius * radius)));
    }

    void volumeOfCylinder() {
        System.out.println("The volume of the Cylinder is "
                + (3.14 * radius * radius * hieght));
    }

}

class rectangle {
    private double length, breadth;

    public rectangle() {
        System.out.println("The value of length and breadth of the rectangle is " + length + " " + breadth);
    }

    public rectangle(int var1, int var2) {
        length = var1;
        breadth = var2;
        System.out.println("The value of length and breadth of the rectangle is " + length + " " + breadth);
    }

    void display() {
    }
}

class Sphere {
    // Taking private values radius,heught
    private double radius, hieght;

    // Sphere class with getter and setter
    // using setvalue() to assign values
    void setvalue(double r, double h) {
        radius = r;
        hieght = h;
    }

    // getval to print the private values
    void getvalue() {
        System.out.println("The Radius is " + radius + " and the hieght is " +
                hieght);
    }

    void surfaceArea() {
        System.out.println("The surface area of Sphere is "
                + (4 * 3.14 * radius * radius));
    }

    void volumeOfSphere() {
        System.out.println("The volume of the Sphere is "
                + ((4 / 3) * 3.14 * radius * radius * radius));
    }

}

public class Ch9_PracticeSet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nQ1.Enter the values of radius and height ");
        double var1, var2;
        var1 = sc.nextDouble();
        var2 = sc.nextDouble();
        // creating an object for Cylinder class
        Cylinder obj1 = new Cylinder(var1, var2);
        // Q1
        // obj1.setvalue(var1, var2);
        // obj1.getvalue();
        // Q2
        System.out.println("\nQ2.");
        obj1.surfaceArea();
        obj1.volumeOfCylinder();

        // Q4.constructor overloading
        rectangle obj2 = new rectangle();
        rectangle obj3 = new rectangle(3, 4);

        obj2.display();
        obj3.display();

        // Q5.Repeate Q1 for Sphere
        Sphere obj4 = new Sphere();
        obj4.setvalue(var1, var2);
        obj4.getvalue();
        obj4.surfaceArea();
        obj4.volumeOfSphere();

        sc.close();
    }
}
