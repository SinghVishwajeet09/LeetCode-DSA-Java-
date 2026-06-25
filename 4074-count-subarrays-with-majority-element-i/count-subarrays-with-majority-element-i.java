class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;

        // Iterate over all subarrays
        for (int i = 0; i < n; i++) {
            int countTarget = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == target) {
                    countTarget++;
                }
                int length = j - i + 1;

                // Majority check
                if (countTarget * 2 > length) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
