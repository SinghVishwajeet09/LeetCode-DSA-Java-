class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {

        int n = s.length();

        int i=0;
        for(int j=1;j<n;j++){
            int res = (s.charAt(j) - s.charAt(i));
            if(res > 2 || res < -2){
                return false;
            }
            i++;
        }

        return true;
    }
}