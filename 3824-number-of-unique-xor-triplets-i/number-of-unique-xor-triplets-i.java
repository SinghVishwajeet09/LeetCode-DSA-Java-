class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if (n <= 2)
            return n;

        int answer = 1;

        while (answer <= n)
            answer <<= 1;

        return answer;
    }
}