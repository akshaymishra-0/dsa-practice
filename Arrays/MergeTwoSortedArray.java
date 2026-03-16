public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        // Print the merged array
        System.out.print("[ ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
        System.out.println("]");
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++]; // this will assign arr1[i] to merged[k] and then increment both i and k
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy any remaining elements from either array 

        // this will copy the remaining elements of arr1 if there are any left after one of them is fully traversed and the k keeps track of the current index in the merged array
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        // this will copy the remaining elements of arr2 if there are any left after one of them is fully traversed and the k keeps track of the current index in the merged array
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }
}
