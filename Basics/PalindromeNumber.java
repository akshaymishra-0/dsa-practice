import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        int originalNum = num;
        int reverse = 0;
        while (originalNum != 0) {
            int digits = originalNum % 10;
            reverse = reverse * 10 + digits;
            originalNum = originalNum / 10;
        }

        if (num == reverse) {
            System.out.println(num + " is a Palindrome Number");
        } else {
            System.out.println(num + " is not a Palindrome Number");
        }
    }
}
