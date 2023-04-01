// Variable Arguments
public class Ch7_03_VariableArgument {
    static int sum(int... arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    // Above is a example of Variable Arguments
    // sum is the method containing parameter as arr which is Variable Argument and
    // also array
    public static void main(String[] args) {
        // Calling method sum with Parameter VariableArgument
        System.out.println("sum = " + sum(2, 3, 4, 6, 8));// 2+3+4+6+8=23
    }
}
