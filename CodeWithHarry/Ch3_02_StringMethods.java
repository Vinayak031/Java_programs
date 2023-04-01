public class Ch3_02_StringMethods {
    public static void main(String[] args) {
        String str = "Vinayak ";

        // 1)Length Method= is used to print the length of the String,returning an
        // integer
        int val = str.length();
        System.out.println("The lenght of the String is " + val);

        // 2)toLowerCase method= is used to convert the given String letters to lower
        // case,it returns String
        String str1 = str.toLowerCase();
        System.out.println("After converting to lower case: " + str1);

        // 3)toUpperCase method=is used to convert the given String letters to Upper
        // case,it returns String
        String str2 = str.toUpperCase();
        System.out.println("After converting to Upper case: " + str2);

        // 4)trim Method=is used to trim all leading and tracking Spaces
        String str3 = "    is a good boy  ";
        str3 = str3.trim();
        System.out.println(str + str3);

        // 5)substring Method=is used create a sub sequent string of iven String
        String str4 = str.substring(2);

        // 0 1 2 3 4 5 6
        // V i n a y a k
        // ----^
        System.out.println("The sub string is " + str4);

        // 6)substring Method with Beginning and Ending Index(end Idx is Excluded)
        // 0 1 2 3 4 5 6
        // V i n a y a k
        // ------^___^
        String str5 = str.substring(3, 6);
        System.out.println("The sub string with starting and ending index:" + str5);

        // 7)replace Method= is used to replace the value with another value
        System.out.println("After replacing the string :" + str.replace("Vi", "Kal"));

        // 8)startsWith Method= is used to check the string is starting with given
        // value,it is case sensitive
        System.out.println(str.startsWith("Vi"));// true
        // System.out.println(str.startsWith("ak"));//false

        // 9)endsWith Method= is used to check the string is Ending with given
        // value,it is case sensitive
        System.out.println(str.startsWith("ak"));// true
        // System.out.println(str.startsWith("Vi"));// false

        // 10)charAt Method will return character at given index
        System.out.println(str.charAt(5));

        // 11)indexOf Method will return a index value of given character
        System.out.println(str.indexOf('n'));

        // 12)indexof MEthod will start searching for character from the given index
        System.out.println(str.indexOf('a', 4));
    }
}
