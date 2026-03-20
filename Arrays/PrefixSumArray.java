public class PrefixSumArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 9};
        int[] result = prefixSum(arr);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }

    public static int[] prefixSum(int[] arr){

        // By creating a New 'pref' Array
        // int n = arr.length;
        // int[] pref = new int[n];
        // pref[0] = arr[0];
        // for(int i=1; i<n; i++){
        //     pref[i] = pref[i-1] + arr[i];
        // }
        // return pref;

        // Without creating a New 'pref' Array
        int n = arr.length;        
        for(int i=1; i<n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
}
