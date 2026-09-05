class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length, m = board[0].length;
        boolean[][] visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if( helper(board, i, j, n, m, word, visited, 0) ) return true;
            }
        }
        return false;
    }

    boolean helper(char[][] board, int row, int col, int n, int m, String word, boolean[][] visited, int c){
        if(c==word.length()) return true;
        if(row>=n || row<0 || col<0 || col>=m || visited[row][col] || board[row][col]!=word.charAt(c)) return false;
        visited[row][col] = true;
        boolean res = helper(board, row+1, col, n, m, word, visited, c+1) ||
        helper(board, row, col+1, n, m, word, visited, c+1) ||
        helper(board, row-1, col, n, m, word, visited, c+1) ||
        helper(board, row, col-1, n, m, word, visited, c+1);
        visited[row][col] = false;

        return res;
    }
}