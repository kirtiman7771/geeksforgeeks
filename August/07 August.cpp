// Solve the Sudoku


class Solution 
{
     public:
    //Function to find a solved Sudoku.
    int mp[9][2]={{0,2},{0,2},{0,2},{3,5},{3,5},{3,5},{6,8},{6,8},{6,8}};
    bool  isSafe(int grid[N][N],int r,int c,int num){
        for(int i=0;i<9;i++){
               if(grid[i][c]==num || grid[r][i]==num)
                    return false;
        }
        for(int i=mp[r][0];i<=mp[r][1];i++){
            for(int j=mp[c][0];j<=mp[c][1];j++){
                    if(grid[i][j]==num)
                        return false;
            }
        }
        return true;
    }
    bool SolveSudoku(int grid[N][N])  
    { 
        // Your code here
        for(int r=0;r<N;r++){
            for(int c=0;c<N;c++){
                if(grid[r][c]==0){
                    for(int num=1;num<=9;num++){
                        if(isSafe(grid,r,c,num)){
                            grid[r][c]=num;
                            if(SolveSudoku(grid))
                                return true;
                            grid[r][c]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    //Function to print grids of the Sudoku.
    void printGrid (int grid[N][N]) 
    {
        // Your code here 
        if(SolveSudoku(grid)){
            for(int i=0;i<N;i++)
                for(int j=0;j<N;j++)
                    cout<<grid[i][j]<<" ";
        }
        else cout<<"No solution exists"<<endl;

    }
};