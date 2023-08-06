// String Permutations

class Solution{
    public:
    //Complete this function
    
      vector<string>ans;
    void helper(string &s,string temp,int vis[],int n){
        if(temp.length()==n){
            ans.push_back(temp);
            return;
        }
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                temp.push_back(s[i]);
                vis[i]=1;
                helper(s,temp,vis,n);
                temp.pop_back();
                vis[i]=0;
            }
        }
    }
    vector<string> permutation(string s)
    {
        //Your code here
        int n=s.length();
        int vis[n];
        for(int i=0;i<n;i++)vis[i]=0;
        helper(s,"",vis,n);
        sort(ans.begin(),ans.end());
        return ans;
    }
};