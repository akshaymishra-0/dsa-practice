import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        long factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("The Factorial of " + num + " is : " + factorial);
    }
}
