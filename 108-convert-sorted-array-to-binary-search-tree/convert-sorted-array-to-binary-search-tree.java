class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return insert(nums, 0, nums.length);
    }
    TreeNode insert(int[] nums, int start, int end) {
        if (start == end) return null;

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = insert(nums, start, mid);
        node.right = insert(nums, mid + 1, end);
        return node;
    }
}