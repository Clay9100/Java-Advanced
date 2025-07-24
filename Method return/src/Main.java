//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // this is lesson method return type

       /* int r = add(2,3);
        System.out.println("r = " + r);*/
        
       /* int r = sub(4,3);
        System.out.println("r = " + r);*/

         /*int r = mul(4,3);
         System.out.println("r = " + r);*/

         /*int r = mod(4,3);
         System.out.println("r = " + r);*/

       /* String r = str(4);
        System.out.println("r = " + r);*/

        /*int r = letter(65);
        System.out.println("r = " + r);*/



    }
    public static boolean checkPasword(String p){
        return  p.matches("[a-zA-Z]+");
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int mul(int a, int b){
        return a * b;
    }

    public static int div(int a, int b){
        return a / b;
    }
    public static int mod(int a, int b){
        return a % b;
    }

    public static String str(int a){
        return String.valueOf(a);
    }

    public static char letter(int a){
        return (char)a;
    }

}