public class SortEvenOdds {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 4, 6, 7, 9, 13, 15, 16, 23, 28}; // Example array
        sortEvenOdds(arr);
    }
    public static void sortEvenOdds(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            if(arr[left] % 2 != 0 && arr[right] % 2 == 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 != 0){
                right--;
            }
        }
        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// if relative order of even and odd numbers matters then we can use the following approach
// public static void sortEvenOdds(int[] arr){
//     int[] temp = new int[arr.length];
//     int index = 0;
//     for(int i = 0; i < arr.length; i++){
//         if(arr[i] % 2 == 0){
//             temp[index++] = arr[i];
//         }
//     }
//     for(int i = 0; i < arr.length; i++){
//         if(arr[i] % 2 != 0){
//             temp[index++] = arr[i];
//         }
//     }
//     // Copy the sorted array back to the original array
//     for(int i = 0; i < arr.length; i++){
//         arr[i] = temp[i];
//     }
//     // Print the sorted array
//     for (int i = 0; i < arr.length; i++) {
//         System.out.print(arr[i] + " ");
//     }
// }


