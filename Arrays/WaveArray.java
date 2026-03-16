public class WaveArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 }; // Example input
        waveArray(arr);
        // Print the result
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void waveArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            // Swap arr[i] and arr[i + 1]
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
