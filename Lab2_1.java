import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();
        if (number1 == number2){
            System.out.println("Number1 is equal to Number2");
        }
        if (number1 != number2){
            System.out.println("Number1 is not equal to Number2");
        }
        if (number1 < number2){
            System.out.println("Number1 is smaller than Number2"); // h
        }
        if (number1 > number2){
            System.out.println("Number1 is greater than Number2");
    }   
    if (number1 >= number2){
        System.out.println("Number1 is greater than or equal to Number2");
    }
    if (number1 <= number2){
        System.out.println("Number1 is less than or equal to Number2");
    }
    input.close();
}
}