class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lastLower = new int[26];
        int[] firstUpper = new int[26];
        Arrays.fill(lastLower, -1);
        Arrays.fill(firstUpper, Integer.MAX_VALUE);
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 'a' && c <= 'z') {
                lastLower[c - 'a'] = i;
            } else {
                if (firstUpper[c - 'A'] == Integer.MAX_VALUE) {
                    firstUpper[c - 'A'] = i;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (lastLower[i] != -1
                && firstUpper[i] != Integer.MAX_VALUE
                && lastLower[i] < firstUpper[i]) {
                count++;
            }
        }
        return count;
    }
}