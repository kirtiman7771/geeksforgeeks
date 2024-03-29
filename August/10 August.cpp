// Longest Common Subsequence

class Solution
{
    public:
    //Function to find the length of longest common subsequence in two strings.
    int lcs(int n, int m, string s1, string s2)
    {
        // your code here
    int LCS[n+1][m+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                if(i==0 || j==0){
                    LCS[i][j]=0;
                    continue;
                }
                
                if(s1[i-1]==s2[j-1])
                    LCS[i][j]=LCS[i-1][j-1]+1;
                else
                    LCS[i][j]=max(LCS[i-1][j], LCS[i][j-1]);
            }
        }
        return LCS[n][m];
    }
};