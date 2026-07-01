// class Solution {
//     private boolean isValid(int row,int col,char[][] board){
//         int i =row-1;
//         while(i>=0){
//             if(board.get(i).charAt(col)=='Q') return false;
//             i--;
//             j++;
//             i=row-1;j = col=1;
//             while(i>=0 && j<board[0].length){
//                 if(board.get(i)charAt(j)=='Q') return false;
//                 i--;
//                 j++;
//             }
//         }
//     }
//     private void func(int row, int n, List<String> board,List<List<String>> ans){
//         if(row==n){
//             ans.add(new ArrayList<>(board));
//             return;

//         }
//         for(j=0;j<n;j++){
//             if(isValid(row,j,board)){
//                 char[] currRow=board.get(row).toCharArray();
//                 currRow[j]='Q';
//                 board.set(row,new String(currRow));
//                 func(row+1,n,board,ans);
//                 currRow[j]=',';
//                 board.set(row,new String(currRow));
//             }
//         }
//     }
//     public List<List<String>> solveNQueens(int n) {
//         List<List<String>> ans = new ArrayList<>();
//         List<List<String>> board = new ArrayList<>();
//         StringBuilder sb = new StringBuilder();
//         for(int i = 0;i<n;i++){
//             sb.append('.');
//             for(int i = 0;i<n;i++){
//                 board.add(sb.toString());
//             }
//             func
//         }
//     }
// }

class Solution {
    private boolean isValid(int row, int col, char[][] board, int n) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }
        return true;
    }

    private void func(int row, int n, char[][] board, List<List<String>> ans) {
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for (int j = 0; j < n; j++) {
            if (isValid(row, j, board, n)) {
                board[row][j] = 'Q';
                func(row + 1, n, board, ans);
                board[row][j] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        func(0, n, board, ans);
        return ans;
    }
}
