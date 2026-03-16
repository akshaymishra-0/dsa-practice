import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        // Input values into the array
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("[ ");
        for (int i = 0; i < numbers.length; i++) {
           System.out.print(numbers[i] + " ");
        }
        System.out.println("]");
        scanner.close();
    }
} 
