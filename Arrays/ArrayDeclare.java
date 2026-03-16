public class ArrayDeclare {
    public static void main(String[] args) {
        // Declare an array of integers
        // int[] numbers = new int[5];

        // Initialize the array with values
        // numbers[0] = 10;
        // numbers[1] = 20;
        // numbers[2] = 30;
        // numbers[3] = 40;
        // numbers[4] = 50;
        int[] numbers = new int[]{10, 20, 30, 40, 50};

        // Print the elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}