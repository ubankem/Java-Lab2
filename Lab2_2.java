import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pass = 0;
        int fail = 0;
        boolean continueEntering = true;
        while(continueEntering){
            System.out.println("Enter result(1 = Pass, 2 = Fail, Other value to Exit)");
          int  user_input = input.nextInt();
           if (user_input == 1){
            pass++;
           }
           else if (user_input == 2){
            fail++;
           }
           else{
            System.out.println("Terminate loop");
             break;
           }
          
        }
        System.out.printf("Passes: %d Fails: %d\n", pass, fail);
        input.close();

    }
}
