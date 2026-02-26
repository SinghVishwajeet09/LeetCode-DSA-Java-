class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String sentence : sentences){
            int count = 1;
            for(char c : sentence.toCharArray()){
                if (c == ' '){
                    count++;
                }
            }
            max=Math.max(max,count);
        }
        return max;
    }
}