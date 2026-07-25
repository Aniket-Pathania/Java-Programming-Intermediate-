import java.util.Arrays;

public class MoveZeroes {

    static class Solution {
        public void moveZeroes(int[] nums) {
            int n = nums.length;
            int j = 0;
            for (int i=0;i<n;i++){
                if(nums[i]!=0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }

            }
        }
    }


    public static void main(String[] args) {
        // Test Case 1: [0,1,0,3,12]
        int[] nums1 = {0, 1, 0, 3, 12};

        // Test Case 2: [0]
        int[] nums2 = {0};

        Solution solution = new Solution();

        System.out.println("Before: " + Arrays.toString(nums1));
        solution.moveZeroes(nums1);
        System.out.println("After:  " + Arrays.toString(nums1));
        System.out.println("Expected: [1, 3, 12, 0, 0]");


    }
}