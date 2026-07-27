import java.util.Arrays;

class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int n = nums.length;
        int j = i + 1;
        while (j < n) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        // Fix: Instantiate the current class, not 'Solution'
        RemoveDuplicatesFromSortedArray sol = new RemoveDuplicatesFromSortedArray();

        int[] nums1 = {1, 1, 2};
        int len1 = sol.removeDuplicates(nums1);
        System.out.println("Length: " + len1);


    }
}