import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // this is lesson String data type

       /* String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");

        System.out.println(s1 == s2); // true

        // String == check variables in memory

        System.out.println(s1 == s3); // false

        // String equals() method also value check
        System.out.println(s1.equals(s3)); //true*/

        String str = "Hello";
        char[] charArray = str.toCharArray(); // [H, e, l, l, o]

        System.out.println(str);
        System.out.println(Arrays.toString(charArray));

        char c =  str.charAt(0);
        System.out.println(c);

        for (int i = 1; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        // int asscii table

        int numberC = str.charAt(0);
        System.out.println(numberC);







    }

    public static int[] ArrayString(String str) {

        int []k = new  int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            k[i] = (int)str.charAt(i);
        }
        return k;

    }

}