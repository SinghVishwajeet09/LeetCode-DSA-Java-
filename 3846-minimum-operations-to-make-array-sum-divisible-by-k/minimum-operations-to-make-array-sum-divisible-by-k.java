class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        int remainder = 0;
        for(int num : nums){
            sum = sum + num;
        }
        remainder = sum % k;
        return remainder;
    }
    
}