public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 1; // Number of positions to rotate
        rotateArray(arr, k);
    }
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k is greater than n

        // For rotating to the right, we can reverse the entire array, then reverse the first k elements, and finally reverse the remaining n-k elements.
        // // Reverse the entire array
        // reverseArray(arr, 0, n - 1);
        // // Reverse the first k elements
        // reverseArray(arr, 0, k - 1);
        // // Reverse the remaining n-k elements
        // reverseArray(arr, k, n - 1);

        // For rotating to the left, we can reverse the first k elements, then reverse the remaining n-k elements, and finally reverse the entire array.
        // Reverse the first k elements
        reverseArray(arr, 0, k - 1);
        // Reverse the remaining n-k elements
        reverseArray(arr, k, n - 1);
        // Reverse the entire array
        reverseArray(arr, 0, n - 1);

        // Print the rotated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
