import java.util.Scanner;

public class AddTwoNum {
    public static void main(String[] args) {
        // int num1 = 45;
        // int num2 = 56;
        // int sum = num1 + num2;
        // System.out.println(sum);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum of " + num1 + " & " + num2 + " is " + sum);
    }
}
