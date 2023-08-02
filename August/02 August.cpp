// Shortest Source to Destination Path

class Solution {
  public:
    int shortestDistance(int N, int M, vector<vector<int>> A, int X, int Y) {
        // code here
    if(!A[0][0]) return -1;
        vector<vector<int>> vis(N,vector<int>(M,0));
        queue<pair<pair<int,int>,int>> q;
        q.push({{0,0},0});
        int delrow[] = {-1,0,1,0};
        int delcol[] = {0,1,0,-1};
        int ans = 1e9;
        while(!q.empty()) {
            int i = q.front().first.first;
            int j = q.front().first.second;
            int c = q.front().second;
            q.pop();
            if(i==X && j==Y) {
                ans = min(ans,c);
                continue;
            }
            else {
                for(int k=0;k<4;k++) {
                    int ni = i + delrow[k];
                    int nj = j + delcol[k];
                    if(ni>=0 && ni<N && nj>=0 && nj<M && !vis[ni][nj] && A[ni][nj]) {
                        vis[ni][nj]=1;
                        q.push({{ni,nj},c+1});
                    }
                }
            }
        }
        if(ans==1e9) return -1;
        return ans;
    }
};