import java.util.Scanner;

// Arrays 
public class Ch6_PracticeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1.Program of sum the floating point array
        System.out.println("\nQ1.Enter the size of array:");
        int size = sc.nextInt();
        float sum1 = 0;
        float arrFloat[] = new float[size];
        System.out.println("Enter values in floating point array: ");
        for (int i = 0; i < size; i++) {
            arrFloat[i] = sc.nextFloat();
            sum1 = sum1 + arrFloat[i];
        }
        System.out.println("The sum of the array values is " + sum1);

        // Q2.Program to find a integer present in an given array or not
        System.out.println("\n Q2 find a integer present in an given array or not");
        int arr[] = { 1, 3, 6, 7, 8, 9 };
        int var = 7;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == var) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("The Given value is present in array ");
        } else {
            System.out.println("NO the given value is not present in array");
        }

        // Q3.Program to calculate average of the marks array
        System.out.println("\n Q3 calculate average of the marks array");
        float marks[] = { 2.3f, 4.56f, 6.34f, 2.56f, 5.6f };
        sum1 = 0;
        for (int i = 0; i < marks.length; i++) {
            sum1 += marks[i];
        }
        System.out.println("The average value of marks array is " + (sum1 / marks.length));

        // Q4.Program to add two matrixes of size 2X2
        System.out.println("\n Q4 add two matrixes of size 2X2");
        int arr1[][] = { { 2, 3 }, { 4, 7 } };
        int arr2[][] = { { 3, 4 }, { 6, 8 } };
        int arr3[][] = new int[2][2];
        System.out.println("The sum of two matrixes is :");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        // Q5.Program to Reverse an array
        System.out.println("\n Q5 Reverse of an array");
        // int arr[] = { 1, 3, 6, 7, 8, 9 };
        int n1 = arr.length - 1;
        for (int i = 0; i < (arr.length / 2); i++) {
            arr[i] = arr[i] + arr[n1];
            arr[n1] = arr[i] - arr[n1];
            arr[i] = arr[i] - arr[n1];
            n1--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Q6.Program to find maximum and minimum value in array
        System.out.println("\nQ6.find maximum and minimum value in array");
        // int arr[] = { 9, 8, 7, 6, 3, 1 };
        int min, max;
        max = 0;
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The min value is " + min + " and max value is " + max);

        // Q7.Program to check that array is sorted or not
        System.out.println("\n Q7.check that array is sorted or not");
        // int arr[] = { 9, 8, 7, 6, 3, 1 };
        flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
            }
        }
        if (flag)
            System.out.println("array is sorted");
        else
            System.out.println("no array is not sorted");
        sc.close();
    }
}
