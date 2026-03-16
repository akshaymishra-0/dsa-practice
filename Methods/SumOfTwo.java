import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNum = input.nextInt();
        int result = sum(firstNum, secondNum);
        System.out.println("The sum of " + firstNum + " and " + secondNum + " is: " + result);
    }

    public static int sum(int num1, int num2) {
        int first = num1;
        int second = num2;
        int sum = first + second;
        return sum;
    }
}
