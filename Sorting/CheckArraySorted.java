public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean isSorted = checkSorted(arr);
        System.out.println("Is the array sorted? " + isSorted);
    }
    public static boolean checkSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Array is not sorted
            }
        }
        return true; // Array is sorted
    }
}
