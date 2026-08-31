class Solution {
    public int maxDistinct(String s) {
        boolean[] seen = new boolean[26];
        int ans = 0;

        for (char c : s.toCharArray()) {
            if (!seen[c - 'a']) {
                seen[c - 'a'] = true;
                ans++;
            }
        }

        return ans;
    }
}