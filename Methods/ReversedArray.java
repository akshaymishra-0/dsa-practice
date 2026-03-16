public class ReversedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArr = reverseArray(arr);
        System.out.print("Reversed Array: ");
        for (int num : reversedArr) {
            System.out.print(num + " ");
        }
    }
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i]; // Fill reversed array from the end of the original array
        }
        return reversed;
    }
}
