import java.util.Scanner;

public class MaxElementOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter the size of the Array: ");
        num = input.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the Array Elements: ");
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The MAXIMUM Element is: " + max);

        // Finding the Minimum Element
        
        // int min = arr[0];
        // for(int i=0; i<arr.length; i++){
        //     if(min>arr[i]){
        //         min = arr[i];
        //     }
        // }
        // System.out.println("The MINIMUM Element is: " + min);
        input.close();  
    }
}
