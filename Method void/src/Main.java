//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // this is lesson method

        /*greeting();
        greeting();
        greeting();*/

        //greeting2("Muhammad");

        infoPerson("Ali", 23);




    }

    public static void greeting(){
        System.out.println("Hello World");
        System.out.println("My name is");
    }

    // params

    public static void greeting2(String name){
        System.out.println("Hello World " + name);
    }

    public static void infoPerson(String name, int age){
        System.out.printf("My name is %s \n", name);
        System.out.printf("My age is %d", age);
    }


}