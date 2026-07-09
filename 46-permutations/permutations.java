class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans);
        return ans;
    }
    private void helper(int[] nums, int index, List<List<Integer>> ans){
        if(index == nums.length){
            List<Integer> list = new ArrayList<>();
            for(int num : nums){
                list.add(num);
            }
            ans.add(list);
            return;
        }
        for(int i = index; i < nums.length; i++){
            swap(nums, index, i);
            helper(nums, index + 1, ans);
            swap(nums, index, i);
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}