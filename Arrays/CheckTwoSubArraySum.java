public class CheckTwoSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 5};
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int prefixSum = 0;
        boolean canPartition = false;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;

            if (prefixSum == suffixSum) {
                canPartition = true; 
                break;
            }
        }

        if (canPartition) {
            System.out.println("The array can be partitioned into two subarrays with equal sum.");
        } else {
            System.out.println("The array cannot be partitioned into two subarrays with equal sum.");
        }
    }
}