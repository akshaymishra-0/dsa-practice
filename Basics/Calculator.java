import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("======= SIMPLE CALCULATOR =======");
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your operation:");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulo\n6.Exit");
        System.out.print("Get Your Choice: ");
        int choice = input.nextInt();
        double num1 = 0;
        double num2 = 0;
        if (choice >= 1 && choice <= 5){
            System.out.print("Enter First Number: ");
            num1 = input.nextDouble(); 
            System.out.print("Enter Second Number: ");
            num2 = input.nextDouble(); 
        }
        switch(choice){
            case 1:
                System.out.println("Result = " + (num1 + num2) );
                break;
            case 2:
                System.out.println("Result = " + (num1 - num2) );
                break;
            case 3:
                System.out.println("Result = " + (num1 * num2) );
                break;
            case 4:
                if (num2 == 0){
                    System.out.println("Cannot Divide by Zero!");
                    break;
                }
                else {
                    System.out.println("Result = " + (num1 / num2) );
                    break;
                }
            case 5:
                System.out.println("Result = " + (num1 % num2) );
                break;
            case 6:
                System.out.println("Exiting...");
                input.close();
                break;
            default:
                System.out.println("Invalid Input");
        }

    }
}
