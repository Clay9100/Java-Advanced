
public class Main {
    public static void main(String[] args) {

        // this is lesson String data type

        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");

        System.out.println(s1 == s2); // true

        // String == check variables in memory

        System.out.println(s1 == s3); // false

        // String equals() method also value check
        System.out.println(s1.equals(s3)); //true





    }
}