public class FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int digits = 0;

            while (num > 0) {
                digits++;
                num = num / 10;
            }

            if (digits % 2 == 0) {
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        FindNumbersWithEvenNumberOfDigits solver = new FindNumbersWithEvenNumberOfDigits();

        int[] nums1 = {12, 345, 2, 6, 7896};

        System.out.println("Output: " + solver.findNumbers(nums1));
        System.out.println("Expected: 2");
    }
}