//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // this is lesson break in nested loop

        // inner loop in break

     /*   for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(j == 5){
                    break;
                }
                System.out.println(i + " " + j);
            }
        }*/

        // out loop break
        /*for (int i = 0; i < 10; i++) {
            if(i == 5){
                break;
            }
            for (int j = 0; j < 5; j++) {

                System.out.println(i + " " + j);
            }
        }*/

        // String in find user

       /* String []users = {"admin", "user", "clay", "temp", "easy"};

        boolean check = false;
        String fUser = "clay1";
        for (int i = 0; i < users.length; i++) {
            if(users[i].equals(fUser)){
                check = true;
                break;
            }
        }

        String strUser = check ? "Found": "Not found";
        System.out.printf("%s %s", fUser, strUser + " user");*/


    }
}