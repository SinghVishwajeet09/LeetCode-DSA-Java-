class Solution {
    public char findTheDifference(String s, String t) {
        long sum = 0, diff = 0;

        for (char c : t.toCharArray()) {
            sum += c - 'a';
        }

        for (char c : s.toCharArray()) {
            diff += c - 'a';
        }

        return (char) (sum - diff + 'a');
    }
}