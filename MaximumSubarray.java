public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {
            sum += num;
            maxSum = Math.max(maxSum, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {-1, -2, -3, -4};

        System.out.println("Maximum subarray sum of nums1: " + maxSubArray(nums1)); // 6
        System.out.println("Maximum subarray sum of nums2: " + maxSubArray(nums2)); // 10
        System.out.println("Maximum subarray sum of nums3: " + maxSubArray(nums3)); // -1
    }
}
