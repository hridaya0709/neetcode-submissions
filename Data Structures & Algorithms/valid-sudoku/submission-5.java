class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                try 
                {
                    int num = Integer.parseInt(String.valueOf(board[i][j]));
                    if(
                        !set.add("row " + i + " " + num) ||
                        !set.add("col " + j + " " + num) ||
                        !set.add("box " + (i/3 * 3) + " " + j/3 + " " + num)
                    ) 
                    {
                        return false;
                    }
                }
                catch(Exception e) {}
                
            }
        }

        return true;
    }
}
