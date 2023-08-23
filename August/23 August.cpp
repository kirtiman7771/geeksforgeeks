// Find the string in grid

class Solution {
public:
	vector<vector<int>>searchWord(vector<vector<char>>grid, string word){
	    // Code here
	 int n = grid.size(),m = grid[0].size(),len = word.length();
        bool isPresent = 1;
        vector<vector<int>> ans;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == word[0]){
                    
                    //Right
                    for(int k=1; k<len; k++){
                        if(j+k>=m || grid[i][j+k] != word[k]){
                            isPresent = 0;break;
                        }
                    }
                    if(isPresent) {
                        ans.push_back({i,j});continue;
                    }
                    isPresent = 1;
                    
                    //left
                    for(int k=1; k<len; k++){
                        if(j-k<0 || grid[i][j-k] != word[k]){
                            isPresent = 0;break;
                        }
                    }
                    if(isPresent) {ans.push_back({i,j});continue;}
                    isPresent = 1;
                    
                    //up
                    for(int k=1; k<len; k++){
                        if(i-k<0 || grid[i-k][j] != word[k]){
                            isPresent = 0; break;
                        }
                    }
                    if(isPresent) {ans.push_back({i,j});continue;}
                    isPresent = 1;
                    
                    //down
                    for(int k=1; k<len; k++){
                        if(i+k>=n || grid[i+k][j] != word[k]){
                            isPresent = 0;break;
                        }
                    }
                    if(isPresent) {ans.push_back({i,j});continue;}
                    isPresent = 1;
                    
                    //w-n
                    for(int k=1; k<len; k++){
                        if(i-k<0 || j-k<0 || grid[i-k][j-k] != word[k]){
                            isPresent = 0;break;
                        }
                    }
                    if(isPresent) {ans.push_back({i,j});continue;}
                    isPresent = 1;
                    
                    //n-e
                    for(int k=1; k<len; k++){
                        if(i-k<0 || j+k>=m || grid[i-k][j+k] != word[k]){
                            isPresent = 0;break;
                        }
                    }
                    if(isPresent) {ans.push_back({i,j});continue;}
                    isPresent = 1;
                    
                    //e-s
                    for(int k=1; k<len; k++){
                        if(i+k>=n || j+k>=m || grid[i+k][j+k] != word[k]){
                            isPresent = 0;break;
                        }
                    }
                    if(isPresent) {ans.push_back({i,j});continue;}
                    isPresent = 1;
                    
                    //s-w
                    for(int k=1; k<len; k++){
                        if(i+k>=n || j-k<0 || grid[i+k][j-k] != word[k]){
                            isPresent = 0;break;
                        }
                    }
                    if(isPresent) ans.push_back({i,j});
                    isPresent = 1;
                }
            }
        }
        return ans;
	}
};