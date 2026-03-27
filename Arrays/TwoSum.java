public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 13;
        int[] result = twoSum(nums, target);
        if(result[0] == -1) {
            System.out.println("No two numbers found that sum to " + target);
        } else {
            System.out.println("Numbers: " + result[0] + ", " + result[1]);
        }
    }

    public static int[] twoSum(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                return new int[] { arr[i], arr[j] };
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[] { -1, -1 };
    }
}