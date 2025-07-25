
public class Main {
    public static void main(String[] args) {

        // this is methods overloading

        /*int max = maxNumber(4,5);
        System.out.println("maxN = " + max);*/

        /*double max = maxNumber(4.7,5.4);
        System.out.println("maxN = " + max);*/

        /*float max = maxNumber(4.3f,5.4f);
        System.out.println("maxN = " + max);*/

       /* byte max = maxNumber((byte) 4,(byte) 5);
        System.out.println("maxN = " + max);*/

        /*double max = maxNumber(4.3,5);
        System.out.println("maxN = " + max);*/

       /* int max = maxNumber(4,5,3);
        System.out.println("maxN = " + max);*/

        double max = maxNumber(4,5, 8,4, 34, 12,-4);
        System.out.println("maxN = " + max);



    }

    public static double maxNumber(double ...n ){
        double max = n[0];

        for(double i : n){
            if(max < i){
                max = i;
            }
        }
        return max;
    }


    public static int maxNumber(int x, int y, int z) {
        int k = maxNumber(x, y);
        return k > z? k : z;
    }

    public static double maxNumber(double x, int y){
        return x > y? x : y;
    }

    public static byte maxNumber(byte a,byte b){
        return a > b ? a : b;
    }

    public static float maxNumber(float f1, float f2){
        return f1 > f2 ? f1 : f2;
    }

    public  static int maxNumber(int a, int b) {
        return a > b ? a : b;
    }

    public static double maxNumber(double a, double b) {
        return a > b ? a : b;
    }
}