import java.util.Scanner;

public class SwapArrElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the index of the first element to swap: ");
        int index1 = input.nextInt() - 1; // Subtracting 1 to convert to zero-based index
        System.out.print("Enter the index of the second element to swap: ");
        int index2 = input.nextInt() - 1; // Subtracting 1 to convert to zero-based index

        System.out.println("Array before swapping:");
        printArray(arr);

        swapElements(arr, index1, index2);

        System.out.println("Array after swapping:");
        printArray(arr);
    }
    public static void swapElements(int[] array, int i, int j) {
        int temp = array[i]; // Store the value at index i in a temporary variable
        array[i] = array[j]; // Assign the value at index j to index i
        array[j] = temp; // Assign the value stored in temp to index j
    }
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
