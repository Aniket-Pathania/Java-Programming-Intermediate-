import java.util.HashMap;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int d : map.keySet()) {
            if (map.get(d) > 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate sol = new ContainsDuplicate();

        int[] nums = {1, 2, 3,1};

        System.out.println(sol.containsDuplicate(nums));
    }
}