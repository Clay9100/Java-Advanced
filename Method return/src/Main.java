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

       /* boolean r = checkPasword("Hello!91%^-$%");
        System.out.println("r = " + r);*/

       /* double r = add(4.5,3);
        System.out.println("r = " + r);*/

        /*float r = tax(1000000,12);
        System.out.println("r = " + r);*/

        /*short r = summa((short) 5,(short) 6);
        System.out.println("r = " + r);*/


        /*String str = checkPositive(3);
        System.out.println(str);*/

        int maxN = maxNumber(4,5);
        System.out.println("maxN = " + maxN);


    }

    public static int maxNumber(int x, int y){
        return x > y ? x : y;
    }

    public static String checkPositive(int x){

        /*if(x != 0){
            if(x > 0){
                return "Positive";
            }else {
                return "Negative";
            }
        }else {
            return "Zero";
        }*/
        return (x > 0)? "Positive" : (x < 0)? "Negative":"Zero";
    }

    public static short summa(short a,short b){
        return (short)(a+b);
    }

    public static float tax(float a, float b){
        return a * (b / 100.0f) ;
    }

    public static double add(double a, double b){
        return a+b;
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