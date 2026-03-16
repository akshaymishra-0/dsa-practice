public class MissingInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5}; // Example array with a missing number
        int missingNumber = findMissingNumber(arr);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Since one number is missing, the total count should be n+1
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;

        // Calculate the sum of the elements in the array
        for (int num : arr) {
            actualSum += num;
        }

        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }
}
