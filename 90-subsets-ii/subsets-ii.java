import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // sort to group duplicates
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>()); // start with empty subset
        int start = 0, end = 0;
        
        for (int i = 0; i < nums.length; i++) {
            start = 0;
            // If current num is same as previous, only extend subsets added in last round
            if (i > 0 && nums[i] == nums[i - 1]) {
                start = end + 1;
            }
            end = res.size() - 1;
            
            int currentSize = res.size();
            for (int j = start; j < currentSize; j++) {
                List<Integer> newSubset = new ArrayList<>(res.get(j));
                newSubset.add(nums[i]);
                res.add(newSubset);
            }
        }
        
        return res;
    }
}
