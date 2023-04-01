// Methods are the functions which execute small part of program and 
// this functions which are written inside clases are called Methods.

public class Ch7_01_Mthods {
    // Methods : Methods are the sub division of the program to a smaller and
    // readable form,for Example

    // Method Prototype
    static void methodExample(/* Parameter */) {
        System.out.println("This may be a Method body");
    }

    /*
     * 1)static is a keyword used to call methods without any class reference.
     * 2)void is the return type of the methods which dosnt retrun any value on its
     * method call.
     * 3)methodExample is the method name,and we can define any name to the method.
     * 4)Parameters are those variables which can be used in methods and
     * are copied while making method call.
     */
    public static void main(String[] args) {

        // method call by using class referance or object
        // Ch7_01_Mthods obj=new Ch7_01_Mthods();
        // obj.methodExample();

        // method call without using class referance or object
        methodExample();
    }
}
