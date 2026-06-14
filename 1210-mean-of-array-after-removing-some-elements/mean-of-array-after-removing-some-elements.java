class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int removeCount = n / 20;
        long sum = 0;
        for (int i = removeCount; i < n - removeCount; i++) {
            sum += arr[i];
        }
        return (double) sum / (n - 2 * removeCount);
    }
}