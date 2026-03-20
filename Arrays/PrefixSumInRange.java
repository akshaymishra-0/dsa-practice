public class PrefixSumInRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        int left = 2; // Starting index of the range
        int right = 4; // Ending index of the range

        int sumInRange;
        // if (left == 0) {
        //     sumInRange = prefixSum[right];
        // } else {
        //     sumInRange = prefixSum[right] - prefixSum[left - 1];
        // }

        // For 1 based indexing
        if (left == 1) {
            sumInRange = prefixSum[right - 1];
        } else {
            sumInRange = prefixSum[right - 1] - prefixSum[left - 2];
        }


        System.out.println("Sum in the range [" + left + ", " + right + "] is: " + sumInRange);
    }
}
