public class Seggregate0s1s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1}; // Example array with 0s and 1s
        seggregate0s1s(arr);
    }

    //     public static void seggregate0s1s(int[] arr) {
    //     int NumberOf0s = 0;
    //     int NumberOf1s = 0;
    //     for( int ele : arr){
    //         if(ele == 0){
    //             NumberOf0s++;
    //         }
    //         else{
    //             NumberOf1s++;
    //         }
    //     }
    //     for(int i = 0; i < NumberOf0s; i++){
    //         arr[i] = 0;
    //     }
    //     for(int i = NumberOf0s; i < arr.length; i++){
    //         arr[i] = 1;
    //     }
    //     // Print the segregated array
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    // }

    public static void seggregate0s1s(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Move the left pointer to the right until we find a 1
            while (left < right && arr[left] == 0) {
                left++;
            }

            // Move the right pointer to the left until we find a 0
            while (left < right && arr[right] == 1) {
                right--;
            }

            // Swap the elements at the left and right pointers
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Print the segregated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
