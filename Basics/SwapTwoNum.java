import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        int temp;
        System.out.println("Before Swapping : First number = " + num1 + " & Second Number = " + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping : First number = " + num1 + " & Second Number = " + num2);
        input.close();
    }
}
