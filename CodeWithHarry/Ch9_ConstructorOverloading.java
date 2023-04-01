
class Base {
    int a = 10;

    // This the Base or super class
    Base() {
        System.out.println("I'm a Base class Constructor with no args");
    }

    Base(int x) {
        System.out.println("I'm a Base class Constructor with x:" + x);
    }
}

class Derived extends Base {
    int b = 11;

    // This is Derived class or sub class which inherits all properties of Base
    Derived() {
        System.out.println("I'm a Derived class Constructor with no args");
    }

    Derived(int x, int y) {
        super(x);
        System.out.println("I'm a Derived class Constructor with x:" + x + " y:" + y);
    }
}

class ChildOfDerived extends Derived {
    int c = 12;

    // This is Derived class of both Base and Derived
    ChildOfDerived() {
        System.out.println("I'm a ChildOfDerived class Constructor with no args");
    }

    ChildOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I'm a ChildOfDerived class Constructor with x:" + x + " y:" + y + " z:" + z);
    }
}

// Above Inheritance is known as Multi-Level Inheritance

public class Ch9_ConstructorOverloading {
    public static void main(String[] args) {
        System.out.println("\n\t1st time by using base object\n");
        // Creating Base class object and calling its constructer
        Base obj = new Base();
        System.out.println();
        Base obj1 = new Base(12);
        System.out.println(obj.a + " " + obj1.a);

        // You cannot access derived varibles from the base class for example
        // System.out.println(obj.b); It will throw an error

        System.out.println("\n\t2nd time by using Derived object\n");
        // Creating Derived class object and calling its constructer
        Derived obj2 = new Derived();
        System.out.println();
        Derived obj3 = new Derived(13, 45);
        System.out.println(obj2.b + " " + obj3.b);

        System.out.println("\n\t3rd time by using Derived object\n");
        // Creating Derived class object and calling its constructer
        ChildOfDerived obj4 = new ChildOfDerived();
        System.out.println();
        ChildOfDerived obj5 = new ChildOfDerived(46, 47, 48);
        System.out.println(obj4.c + " " + obj5.c);
    }
}
