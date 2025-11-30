public class SearchRange {

    public static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private static int findFirst(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int first = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                first = mid;
                r = mid - 1; // keep searching left
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return first;
    }

    private static int findLast(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int last = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                last = mid;
                l = mid + 1; // keep searching right
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] result = searchRange(nums, target);
        System.out.println("First and Last Occurrence: [" + result[0] + ", " + result[1] + "]");
    }
}
