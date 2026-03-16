import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Numbers: ");
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        float Average = 0f;
        for (int i = 0; i < arr.length; i++) {
            Average = Average + arr[i];
        }
        Average = Average / arr.length;
        System.out.println("The Average is: " + Average);

    }
}
