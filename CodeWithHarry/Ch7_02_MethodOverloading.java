/* Method Overloading is concept of testing capability of class object or referance 
 * to determine multiple methods of same name , but differ in return type and parameter list
 */
public class Ch7_02_MethodOverloading {
    // Here is the example of method overloading
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(int a, int b, float c) {
        return a + b + c;
    }

    /*
     * sum is the method which is overloaded by differ in parameter , return type
     * and datatype of parameter
     */
    public static void main(String[] args) {
        int var1 = 10, var2 = 20, var3 = 30;
        float var4 = 566.8f;
        Ch7_02_MethodOverloading obj1 = new Ch7_02_MethodOverloading();
        // Method call with its referance
        System.out.println("Calling first sum method with two integer :" + obj1.sum(var1, var2));
        System.out.println("Calling Second sum method with three integer :" + obj1.sum(var1, var2, var3));
        System.out.println("Calling third sum method with two integer and one floating point number :"
                + obj1.sum(var1, var2, var4));
    }
}
