// Add 1 to a number representated as an array of digits. For example, if the input is [1, 2, 3], the output should be [1, 2, 4].

public class AddingOne {
    public static void main(String[] args) {
        int[] digits = { 1, 9, 9 }; // Example input
        int[] result = addOne(digits);
        // Print the result
        System.out.print("[ ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("]");
    }

    public static int[] addOne(int[] digits) {
        // Implementation for adding one to the number represented as an array of digits
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // If we reach here, it means all digits were 9, so we need to add a new digit
        // at the beginning
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;

    }

}
