public class FindSecondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 4};
        int secondLargest = findSecondLargest(arr);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("There is no second largest element.");
        }
    }
    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            return Integer.MIN_VALUE; // Not enough elements to find second largest
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest; // Update second largest before updating largest
                largest = num; // Update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num; // Update second largest if it's greater than current second largest and not equal to largest
            }
        }
        return secondLargest;
    }
}
