import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNum = input.nextInt();
        maxoftwo(firstNum,secondNum);
    }
    public static void maxoftwo(int num1, int num2) {
        int first = num1;
        int second = num2;
        if(first>second){
            System.out.println("The Maximum of "+ first + " and " + second + " is: " + first);
        }else if(second>first){
            System.out.println("The Maximum of "+ first + " and " + second + " is: " + second);
        }else{
            System.out.println("The given two numbers are SAME");
        }
    }
}
