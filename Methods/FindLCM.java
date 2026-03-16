import java.util.Scanner;

public class FindLCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");  
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int lcm = findLCM(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b); // LCM can be calculated using GCD
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b); // Recursive call to find GCD using Euclidean algorithm
    }
}
