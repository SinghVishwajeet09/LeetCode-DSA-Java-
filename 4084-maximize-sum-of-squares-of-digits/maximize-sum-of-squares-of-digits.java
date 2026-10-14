class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        while (sum >= 9) {
            sb.append('9');
            sum -= 9;
        }

        if (sum > 0) {
            sb.append(sum);
        }

        while (sb.length() < num) {
            sb.append('0');
        }

        return sb.toString();
    }
}