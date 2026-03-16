import java.util.Scanner;

public class MaxOfMany {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        int result = maxofmany(arr);
        System.out.print("The Maximum element of " + java.util.Arrays.toString(arr) + " is: " + result);
    }

    public static int maxofmany(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

