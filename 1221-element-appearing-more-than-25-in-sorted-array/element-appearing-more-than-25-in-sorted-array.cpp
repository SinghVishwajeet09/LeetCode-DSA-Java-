class Solution {
public:
    int findSpecialInteger(vector<int>& arr) {
        int n = arr.size();
        int threshold = n / 4;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > threshold)
                return arr[i];
        }
        return arr[0];
    }
};