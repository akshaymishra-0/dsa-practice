public class SortSquaresNonDecreArray {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10}; // Example sorted array
        sortedSquares(arr);
        // Print the result
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortedSquares(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[arr.length];
        int index = arr.length - 1;
        while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare) {
                result[index--] = leftSquare;
                left++;
            } else {
                result[index--] = rightSquare;
                right--;
            }
        }
        // Copy the result back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }


    }
}
