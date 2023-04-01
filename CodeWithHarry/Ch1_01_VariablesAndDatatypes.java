// Chapter 1
public class Ch1_01_VariablesAndDatatypes {
    // Data Type : There are several data type such as
    // byte,short,int,char,float,double etc.
    // This datatypes are used to define the Size and Domain(Nature) of the variable

    // Variable : This are the storage element ,which can store a specified domain
    // -value or according to datatype

    public static void main(String[] args) {
        // Here are the exaples of data type and variable

        byte var1 = 26; // here byte is a data type which can store upto -2^7 to (2^7-1)

        short var2 = 3984; // short can store data upto -2^15 to (2^15-1)

        int var3 = 10; // int can store data upto -2^31 to (2^31-1)

        long var4 = 78977; // long can stroe data upto -2^63 to (2^63-1)

        float var5 = 2.4f; // float can store data upto -2^31 to(2^31-1)

        double var6 = 2.67; // double can store data upto -2^63 to(2^63-1)

        char var7 = 'J'; // char will store single character and
        // characters are assigned through unicode values

        String var8 = "Java Tutorial";// String is a character array can store words

        // Literals : Literals are those values which are assigned to the variables
        // In above variables 26,3984,10,78977,2.4,2.67,J,Java Tutorial are the literals

        // Displaying all variables
        System.out.println("\nData Type     Variables   Assigned literals\n");
        System.out.println("  Byte          var1    =      " + var1);
        System.out.println("  short         var2    =      " + var2);
        System.out.println("  int           var3    =      " + var3);
        System.out.println("  long          var4    =      " + var4);
        System.out.println("  float         var5    =      " + var5);
        System.out.println("  double        var6    =      " + var6);
        System.out.println("  char          var7    =      " + var7);
        System.out.println("  String        var8    =      " + var8);
    }
}