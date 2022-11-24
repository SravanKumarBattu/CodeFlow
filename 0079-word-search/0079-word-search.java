class Solution {
    public boolean exist(char[][] board, String word) {
     char ch = word.charAt(0);
     int m= board.length;
     int n= board[0].length;
     for(int i=0;i<m;i++)
     {
         for(int j=0;j<n;j++)
         {
             if(ch == board[i][j] && sol(board,i,j,word,0,m,n,ch))
                 return true;
         }
     }
        return false;
    }
    public boolean possible(char[][]board , int i,int j,String word, int index,int m,int n){
        if(index==word.length())
            return true;
        char ch=word.charAt(index);
        
        if(i>0 && board[i-1][j] == ch && sol(board,i-1,j,word,index,m,n,ch))
            return true;
        if(i < m-1 && board[i+1][j] == ch && sol(board,i+1,j,word,index,m,n,ch))
            return true;
        if(j>0 && board[i][j-1]== ch && sol(board,i,j-1,word,index,m,n,ch))
            return true;
        if(j < n-1 && board[i][j+1] == ch )
            return sol(board,i,j+1,word,index,m,n,ch);
        return false;
        
    }
    public boolean sol(char[][] board, int i, int j, String word, int index, int m, int n, char ch)
    {
        board[i][j]=0;
        if(possible(board,i,j,word,index+1,m,n))
        {
            return true;
        }
        else board[i][j]=ch;
        return false;
    }
}