import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter the size of the Array: ");
        num = input.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the Array Elements: ");
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = input.nextInt();
        }
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.println("The Sum of your array elements is: " + sum);
        input.close();
    }
}
